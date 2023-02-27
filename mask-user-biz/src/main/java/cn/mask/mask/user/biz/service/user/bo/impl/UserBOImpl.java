package cn.mask.mask.user.biz.service.user.bo.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterInfoDTO;
import cn.mask.mask.user.api.register.dto.UserBaseDTO;
import cn.mask.mask.user.biz.common.config.idgenerator.SequenceGenerator;
import cn.mask.mask.user.biz.common.constant.CommonConstant;
import cn.mask.mask.user.biz.service.user.bo.IUserBO;
import cn.mask.mask.user.biz.service.user.dao.UserBaseMapper;
import cn.mask.mask.user.biz.service.user.pojo.dto.QUserBaseDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.UserBasePO;
import com.baidu.fsg.uid.impl.DefaultUidGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 17:28:40
 */
@Component
public class UserBOImpl implements IUserBO {

    @Resource
    private UserBaseMapper userBaseMapper;

    @Resource
    private SequenceGenerator sequenceGenerator;

    @Resource
    private DefaultUidGenerator defaultUidGenerator;

    @Override
    public UserBaseDTO addUser(UserBaseDTO userBaseDTO, RegisterInfoDTO registerInfoDTO) {
        UserBasePO userBasePO = packUserPO(userBaseDTO, registerInfoDTO);
        userBaseMapper.insert(userBasePO);
        return BeanUtil.copyProperties(userBasePO, UserBaseDTO.class);
    }

    /**
     * 批量查询用户信息
     *
     * @param qUserBaseDTO {@link QUserBaseDTO} 查询信息
     * @return {@link UserBasePO} 用户信息
     * @throws MaskException e
     */
    @Override
    public List<UserBasePO> listUser(QUserBaseDTO qUserBaseDTO) throws MaskException {
        if (ObjectUtil.isNull(qUserBaseDTO)) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "查询用户基本信息时，请传入至少一项必填参数");
        }
        List<UserBasePO> userBasePOList = userBaseMapper.listUserByQUserBaseDTO(qUserBaseDTO);
        return new ArrayList<>(userBasePOList);
    }

    /**
     * 装配UserPO
     *
     * @param userBaseDTO {@link UserBaseDTO} 用户基本信息，
     * @return {@link UserBasePO}
     */
    private UserBasePO packUserPO(UserBaseDTO userBaseDTO, RegisterInfoDTO registerInfoDTO) {
        UserBasePO userBasePO = new UserBasePO();
        userBaseDTO.setUserId(generateUserId());
        BeanUtils.copyProperties(userBaseDTO, userBasePO);
        userBasePO.setCrterId(userBaseDTO.getUserId());
        userBasePO.setCrterName(userBaseDTO.getUsername());
        userBasePO.setStatus(CommonConstant.USER_STATUS_NORMAL);
        userBasePO.setCrteAppId(registerInfoDTO.getRegAppId());
        userBasePO.setCrteType(registerInfoDTO.getRegType().getType());
        userBasePO.setUpdterId(userBaseDTO.getUserId());
        userBasePO.setUsername(userBaseDTO.getUsername());
        userBasePO.setUpdtTime(new Date());
        return userBasePO;
    }

    /**
     * 生成用户id
     *
     * @return 用户id
     */
    public String generateUserId() {
        return String.valueOf(sequenceGenerator.getNext("userId", 8));
    }
}
