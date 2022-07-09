package cn.mask.mask.user.dubbo.service.user.service;


import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import cn.mask.mask.user.api.user.service.UserService;
import cn.mask.mask.user.dubbo.service.user.bo.UserBO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-04-11 22:05:54
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserBO userBO;

    /**
     * 创建系统用户
     *
     * @param WeiXinUserInfo 用户信息 {@link WeiXinUserInfo}
     */
    @Override
    public void addUser(WeiXinUserInfo WeiXinUserInfo) {

    }

    /**
     * 根据用户id查询用户信息
     *
     * @param userId 用户id
     * @return 用户信息 {@link WeiXinUserInfo}
     */
    @Override
    public WeiXinUserInfo getUserByUserId(String userId) {
        return null;
    }
}
