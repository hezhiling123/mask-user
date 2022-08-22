package cn.mask.mask.user.dubbo.service.useridentity.bo.impl;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.dubbo.service.useridentity.bo.UserIdentityBO;
import cn.mask.mask.user.dubbo.service.useridentity.dao.UserIdentityMapper;
import cn.mask.mask.user.dubbo.service.useridentity.pojo.dto.QUserIdentityDTO;
import cn.mask.mask.user.dubbo.service.useridentity.pojo.po.UserIdentityPO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 23:13:28
 */
@Component
public class UserIdentityBOImpl implements UserIdentityBO {

    @Resource
    private UserIdentityMapper userIdentityMapper;

    /**
     * 插入用户认证信息
     *
     * @param userIdentityPO {@link UserIdentityPO}
     * @throws MaskException e
     */
    @Override
    public void insertUserIdentity(UserIdentityPO userIdentityPO) throws MaskException {
        userIdentityMapper.insert(userIdentityPO);
    }

    @Override
    public UserIdentityPO queryUserIdentity(QUserIdentityDTO qUserIdentityDTO) {
        return userIdentityMapper.listUserIdentity(qUserIdentityDTO);
    }
}
