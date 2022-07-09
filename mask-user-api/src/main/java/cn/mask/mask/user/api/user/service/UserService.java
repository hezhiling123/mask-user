package cn.mask.mask.user.api.user.service;

import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;

public interface UserService {
    /**
     * 创建系统用户
     *
     * @param WeiXinUserInfo  用户信息 {@link WeiXinUserInfo}
     */
    void addUser(WeiXinUserInfo WeiXinUserInfo);

    /**
     *  根据用户id查询用户信息
     *
     * @param userId    用户id
     * @return  用户信息 {@link WeiXinUserInfo}
     */
    WeiXinUserInfo getUserByUserId(String userId);
}
