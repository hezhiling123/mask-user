package cn.mask.mask.user.dubbo.service.register.process.impl.weixin;

import cn.hutool.core.collection.CollectionUtil;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterDTO;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.dto.weixin.WeiXinRegisterDTO;
import cn.mask.mask.user.api.register.enums.RegTypeEnum;
import cn.mask.mask.user.dubbo.service.register.process.AbstractRegisterBO;
import cn.mask.mask.user.dubbo.service.register.process.RegisterBO;
import cn.mask.mask.user.dubbo.service.user.bo.IOpenCreditBO;
import cn.mask.mask.user.dubbo.service.user.pojo.dto.QOpenCreditDTO;
import cn.mask.mask.user.dubbo.service.user.pojo.po.OpenCreditPO;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 21:33:07
 */
@Component
public class WeiXinRegisterBOImpl extends AbstractRegisterBO implements RegisterBO, InitializingBean {

    @Resource
    private IOpenCreditBO IOpenCreditBO;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    /**
     * 微信注册
     *
     * @param weiXinRegisterDTO {@link WeiXinRegisterDTO}
     * @return 注册结果 {@link RegisterResultDTO}
     * @throws MaskException e
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public RegisterResultDTO registerByWeiXin(WeiXinRegisterDTO weiXinRegisterDTO) throws MaskException {
        checkRegisterData(weiXinRegisterDTO);
        String userId = super.generateUserId();
        weiXinRegisterDTO.getUserBaseInfo().setUserId(userId);
        super.saveUserBaseInfo(weiXinRegisterDTO.getUserBaseInfo(), weiXinRegisterDTO.getRegisterInfo());
        OpenCreditPO openCreditPO = initOpenCreditParams(weiXinRegisterDTO);
        openCreditPO.setOpenId(weiXinRegisterDTO.getOpenId());
        super.saveOpenCredit(openCreditPO);
        RegisterResultDTO registerResultDTO = new RegisterResultDTO();
        registerResultDTO.setUserId(userId);
        registerResultDTO.setUserName(weiXinRegisterDTO.getUserBaseInfo().getNickName());
        return registerResultDTO;
    }

    /**
     * 获取接口实现类支持的注册类型
     *
     * @return {@link RegTypeEnum}
     */
    @Override
    public RegTypeEnum getRegTypeEnum() {
        return RegTypeEnum.WEI_XIN;
    }

    /**
     * 检查注册参数是否正确
     *
     * @param weiXinRegisterExtDTO {@link RegisterDTO}
     * @throws MaskException e
     */
    private void checkRegisterData(WeiXinRegisterDTO weiXinRegisterExtDTO) throws MaskException {
        super.checkType(weiXinRegisterExtDTO.getRegisterInfo().getRegType().getType());
        if (StringUtils.isEmpty(weiXinRegisterExtDTO.getOpenId())) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "微信注册时，openId不能为空");
        }
        super.checkBaseInfoHasRegister(weiXinRegisterExtDTO);
        checkWeiXinOpenIdExists(weiXinRegisterExtDTO);
    }

    /**
     * 检查是否已经微信注册
     *
     * @param weiXinRegisterDTO
     */
    private void checkWeiXinOpenIdExists(WeiXinRegisterDTO weiXinRegisterDTO) throws MaskException {
        QOpenCreditDTO qOpenCreditDTO = new QOpenCreditDTO();
        qOpenCreditDTO.setBindType(getRegTypeEnum().getType());
        qOpenCreditDTO.setOpenId(weiXinRegisterDTO.getOpenId());
        List<OpenCreditPO> openCreditPOList = IOpenCreditBO.listOpenCredit(qOpenCreditDTO);
        if (CollectionUtil.isNotEmpty(openCreditPOList)) {
            throw new MaskException(ResultCode.WEI_XIN_OPEN_ID_EXISTS, "该微信号已绑定，请勿重复绑定");
        }
    }
}
