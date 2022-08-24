package cn.mask.mask.user.api.user.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import cn.mask.mask.user.api.register.dto.UserBaseInfoDTO;
import cn.mask.mask.user.api.user.dto.QUserDTO;

public interface IUserService {
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
    WrapperResponse<WeiXinUserInfo> getUserByUserId(String userId);

    /**
     * 模糊查询用户信息
     * @param qUserDTO  {@link QUserDTO}
     * @return {@link UserBaseInfoDTO}
     */
    WrapperResponse<UserBaseInfoDTO> queryUserByCondition(QUserDTO qUserDTO) throws MaskException;
}
