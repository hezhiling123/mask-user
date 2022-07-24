package cn.mask.mask.user.dubbo.service.register.process.impl.weixin;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.enums.RegTypeEnum;
import cn.mask.mask.user.dubbo.service.register.process.AbstractRegisterProcess;
import cn.mask.mask.user.dubbo.service.user.dao.UserMapper;
import cn.mask.mask.user.dubbo.useridentity.pojo.po.UserIdentityPO;
import cn.mask.mask.user.dubbo.service.user.pojo.po.UserPO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 21:33:07
 */
@Component
public class WeiXinRegisterBO extends AbstractRegisterProcess<WeiXinRegisterDTO, RegisterResultDTO> implements InitializingBean {

    @Resource
    private UserMapper userMapper;

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    /**
     * 微信注册
     *
     * @param o 注册信息
     * @return 注册结果信息
     * @throws MaskException e
     */
    @Override
    public RegisterResultDTO register(WeiXinRegisterDTO weiXinRegisterDTO) throws MaskException {
        super.checkType(weiXinRegisterDTO.getRegisterInfoDTO().getRegType().getType());
        checkRegisterData(weiXinRegisterDTO);
        String userId = super.generateUserId();
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(weiXinRegisterDTO.getUserBaseInfo(), userPO);
        userPO.setUserId(userId);
        UserIdentityPO userIdentityPO = new UserIdentityPO();
        userIdentityPO.setUserId(userId);
        return null;
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
     * @param weiXinRegisterDTO {@link WeiXinRegisterDTO}
     * @throws MaskException e
     */
    void checkRegisterData(WeiXinRegisterDTO weiXinRegisterDTO) throws MaskException {
    }
}
