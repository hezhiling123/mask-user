package cn.mask.mask.user.dubbo.useridentity.bo;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.dubbo.useridentity.dao.UserIdentityMapper;
import cn.mask.mask.user.dubbo.useridentity.pojo.po.UserIdentityPO;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 23:16:05
 */
public interface UserIdentityBO {

    /**
     * 插入用户认证信息
     * @param userIdentityPO {@link UserIdentityPO}
     * @throws MaskException e
     */
    void insertUserIdentity(UserIdentityPO userIdentityPO) throws MaskException;

    UserIdentityPO queryUserIdentity();
}
