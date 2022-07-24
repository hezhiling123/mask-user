package cn.mask.mask.user.api.login.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import cn.mask.mask.user.api.login.dto.WeiXinLoginInfo;
import cn.mask.mask.user.api.user.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-04-01 15:01:52
 */
public interface LoginService {
    /**
     * 微信登录（若是未注册，则进行注册)
     * @param weiXinLoginInfo 微信登录信息
     * @return  用户信息{@link UserDTO}
     */
    WrapperResponse<UserDTO> loginByWeiXin(@RequestBody WeiXinLoginInfo weiXinLoginInfo) throws MaskException;
    WrapperResponse<WeiXinUserInfo> login(String tokenStr);
    WrapperResponse<WeiXinUserInfo> loginByToken(String tokenStr) throws MaskException;
}
