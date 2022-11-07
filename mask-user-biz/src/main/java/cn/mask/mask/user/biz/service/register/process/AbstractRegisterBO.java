package cn.mask.mask.user.biz.service.register.process;

import cn.hutool.core.collection.CollectionUtil;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterDTO;
import cn.mask.mask.user.api.register.dto.RegisterInfoDTO;
import cn.mask.mask.user.api.register.dto.UserBaseInfoDTO;
import cn.mask.mask.user.biz.service.user.pojo.dto.QUserBaseDTO;
import cn.mask.mask.user.biz.service.useridentity.bo.UserIdentityBO;
import cn.mask.mask.user.biz.service.user.bo.IUserBO;
import cn.mask.mask.user.biz.service.user.bo.IOpenCreditBO;
import cn.mask.mask.user.biz.service.user.pojo.po.OpenCreditPO;
import cn.mask.mask.user.biz.service.user.pojo.po.UserBasePO;
import cn.mask.mask.user.biz.service.useridentity.pojo.po.UserIdentityPO;
import com.baidu.fsg.uid.impl.DefaultUidGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 22:28:21
 */
@Component
public abstract class AbstractRegisterBO implements RegisterBO {

    @Resource
    private DefaultUidGenerator defaultUidGenerator;

    @Resource
    private IUserBO userBO;

    @Resource
    private UserIdentityBO userIdentityBO;

    @Resource
    private IOpenCreditBO openCreditBO;

    /**
     * 检查注册类型是否正确。
     *
     * @param regType 注册类型
     * @throws MaskException e
     */
    @Override
    public void checkType(String regType) throws MaskException {
        if (StringUtils.isEmpty(regType)) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "注册类型不能为空");
        }
        if (!regType.equals(getRegTypeEnum().getType())) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "非法的注册类型");
        }
    }

    /**
     * 检查公共参数中是否已经注册，若已注册，则返回用户信息
     *
     * @param registerDTO {@link RegisterDTO}
     */
    public void checkBaseInfoHasRegister(RegisterDTO registerDTO) throws MaskException {
        QUserBaseDTO qUserBaseDTO = new QUserBaseDTO();
        qUserBaseDTO.setTel(registerDTO.getUserBaseInfo().getTel());
        List<UserBasePO> userPOList = userBO.listUser(qUserBaseDTO);
        if (CollectionUtil.isNotEmpty(userPOList)) {
            throw new MaskException(ResultCode.PHONE_NUMBER_EXISTS, "该手机号已被占用");
        }
        QUserBaseDTO qEmail = new QUserBaseDTO();
        qEmail.setEmail(registerDTO.getUserBaseInfo().getEmail());
        List<UserBasePO> userBasePOList = userBO.listUser(qEmail);
        if (CollectionUtil.isNotEmpty(userBasePOList)) {
            throw new MaskException(ResultCode.EMAIL_EXISTS, "该邮箱号已被占用");
        }
    }

    @Transactional
    public void saveUserBaseInfo(UserBaseInfoDTO userBaseInfoDTO, RegisterInfoDTO registerInfoDTO) throws MaskException {
        userBO.addUser(userBaseInfoDTO, registerInfoDTO);
    }

    /**
     * 存储用户绑定信息
     *
     * @param openCreditPO {@link IOpenCreditBO} 用户绑定信息
     * @throws MaskException e
     */
    @Transactional
    public void saveOpenCredit(OpenCreditPO openCreditPO) throws MaskException {
        openCreditBO.saveOpenCredit(openCreditPO);
    }

    @Transactional
    public void saveUserIdentityInfo(UserIdentityPO userIdentityPO) throws MaskException {
        userIdentityBO.insertUserIdentity(userIdentityPO);
    }

    /**
     * 生成用户id
     *
     * @return 用户id
     */
    public String generateUserId() {
        return String.valueOf(defaultUidGenerator.getUID());
    }

    /**
     * 组装绑定信息的公共部分
     *
     * @param registerDTO {@link RegisterDTO}
     * @return {@link RegisterDTO}
     */
    public OpenCreditPO initOpenCreditParams(RegisterDTO registerDTO) {
        OpenCreditPO openCreditPO = new OpenCreditPO();
        BeanUtils.copyProperties(registerDTO.getUserBaseInfo(), openCreditPO);
        openCreditPO.setId(String.valueOf(defaultUidGenerator.getUID()));
        openCreditPO.setCrtorId(registerDTO.getUserBaseInfo().getUserId());
        openCreditPO.setCrtorName(registerDTO.getUserBaseInfo().getUsername());
        return openCreditPO;
    }
}
