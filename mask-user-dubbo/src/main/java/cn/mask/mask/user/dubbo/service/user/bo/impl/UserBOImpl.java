package cn.mask.mask.user.dubbo.service.user.bo.impl;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.ObjectUtil;
import cn.mask.mask.user.dubbo.common.constant.CommonConstant;
import cn.mask.mask.user.dubbo.service.user.bo.UserBO;
import cn.mask.mask.user.dubbo.service.user.dao.UserMapper;
import cn.mask.mask.user.dubbo.service.user.pojo.dto.UserDTO;
import cn.mask.mask.user.dubbo.service.user.pojo.po.UserPO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 17:28:40
 */
@Component
public class UserBOImpl implements UserBO {

    @Resource
    UserMapper userMapper;

    @Override
    public void addUser(UserDTO userDTO) {
        userMapper.insert(packUserPO(userDTO));
    }

    /**
     * 装配UserPO
     *
     * @param userDTO   dto
     * @return  {@link UserPO}
     */
    private UserPO packUserPO(UserDTO userDTO) {
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(userDTO, userPO);
        return UserPO.builder()
                .userId("1")
                .avatar("1")
                .status(CommonConstant.USER_STATUS_NO_ACTIVATION)
                .gender(ObjectUtil.isNull(userPO.getGender()) ? 0 : userPO.getGender())
                .creatorName("system")
                .creatorId("system")
                .createTime(new DateTime())
                .updaterId("system")
                .updaterName("register")
                .updateTime(new DateTime())
                .build();
    }
}
