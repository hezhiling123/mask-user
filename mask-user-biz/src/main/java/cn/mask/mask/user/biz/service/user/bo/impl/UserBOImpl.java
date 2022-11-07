package cn.mask.mask.user.biz.service.user.bo.impl;

import cn.hutool.core.util.ObjectUtil;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterInfoDTO;
import cn.mask.mask.user.api.register.dto.UserBaseInfoDTO;
import cn.mask.mask.user.biz.common.constant.CommonConstant;
import cn.mask.mask.user.biz.service.user.bo.IUserBO;
import cn.mask.mask.user.biz.service.user.dao.UserBaseMapper;
import cn.mask.mask.user.biz.service.user.pojo.dto.QUserBaseDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.UserBasePO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 17:28:40
 */
@Component
public class UserBOImpl implements IUserBO {

    @Resource
    UserBaseMapper userBaseMapper;

    @Override
    public void addUser(UserBaseInfoDTO userBaseInfoDTO, RegisterInfoDTO registerInfoDTO) {
        userBaseMapper.insert(packUserPO(userBaseInfoDTO, registerInfoDTO));
    }

    /**
     * 批量查询用户信息
     *
     * @param qUserBaseDTO {@link QUserBaseDTO} 查询信息
     * @return {@link UserPO} 用户信息
     * @throws MaskException e
     */
    @Override
    public List<UserBasePO> listUser(QUserBaseDTO qUserBaseDTO) throws MaskException {
        if (ObjectUtil.isNull(qUserBaseDTO)) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "查询用户基本信息时，请传入至少一项必填参数");
        }
        return userBaseMapper.listUserByQUserBaseDTO(qUserBaseDTO);
    }

    /**
     * 装配UserPO
     *
     * @param userBaseInfoDTO {@link UserBaseInfoDTO} 用户基本信息，
     * @return {@link UserBasePO}
     */
    private UserBasePO packUserPO(UserBaseInfoDTO userBaseInfoDTO, RegisterInfoDTO registerInfoDTO) {
        UserBasePO userBasePO = new UserBasePO();
        BeanUtils.copyProperties(userBaseInfoDTO, userBasePO);
        userBasePO.setCrtorId(userBaseInfoDTO.getUserId());
        userBasePO.setCrtorName(userBaseInfoDTO.getUsername());
        userBasePO.setStatus(CommonConstant.USER_STATUS_NORMAL);
        userBasePO.setCrteAppId(registerInfoDTO.getRegAppId());
        userBasePO.setCrteType(registerInfoDTO.getRegType().getType());
        return userBasePO;
    }
}
