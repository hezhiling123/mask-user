package cn.mask.mask.user.dubbo.service.login.service;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.constant.ResponseCodeConstant;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.common.core.framework.web.exception.ResultStatusCode;
import cn.mask.mask.model.user.po.UserPO;
import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import cn.mask.mask.user.api.login.dto.WeiXinLoginInfo;
import cn.mask.mask.user.api.login.service.LoginService;
import cn.mask.mask.user.api.user.dto.UserDTO;
import cn.mask.mask.user.dubbo.common.constant.CommonConstant;
import cn.mask.mask.user.dubbo.service.user.bo.UserBO;
import cn.mask.mask.user.dubbo.service.user.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mask
 */
@Slf4j
@RestController
@RequestMapping("/user/mask/service/login")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper userMapper;

    @Resource
    private WxMaService wxService;

    @Resource
    private UserBO userBO;

    /**
     * 微信登录
     *
     * @param weiXinLoginInfo 请求内容，{ code: xxx, userInfo: xxx }
     * @return 登录结果
     **/
    @Override
    @PostMapping("loginByWeiXin")
    @Transactional
    public WrapperResponse<UserDTO> loginByWeiXin(@RequestBody WeiXinLoginInfo weiXinLoginInfo) throws MaskException {
        String code = weiXinLoginInfo.getCode();
        WeiXinUserInfo WeiXinUserInfo = weiXinLoginInfo.getWeiXinUserInfo();
        log.info(code);
        log.info(WeiXinUserInfo.toString());
        if (code == null) {
            return WrapperResponse.error(ResultStatusCode.HTTP_ERROR_400.getCode(), "微信认证code为空，无法登录", null);
        }

        String sessionKey;
        String openId;
        try {
            WxMaJscode2SessionResult result = this.wxService.getUserService().getSessionInfo(code);
            sessionKey = result.getSessionKey();
            openId = result.getOpenid();
        } catch (Exception e) {
            throw new MaskException(ResultStatusCode.HTTP_ERROR_500.getCode(), "调起微信认证服务失败" + e.getMessage());
        }

        if (StringUtils.isBlank(sessionKey) || StringUtils.isBlank(openId)) {
            throw new MaskException(ResultStatusCode.HTTP_ERROR_500.getCode(), "微信认证服务返回为空");
        }
        return WrapperResponse.success(new UserDTO());
    }

    /**
     * 通过token登录
     *
     * @param tokenStr token
     * @return {@link UserPO}
     */
    @Override
    @PostMapping("login")
    public WrapperResponse<WeiXinUserInfo> login(String tokenStr) {
        return null;
    }

    /**
     * 通过token登录
     *
     * @param tokenStr token
     * @return {@link WeiXinUserInfo}
     */
    @Override
    @PostMapping("loginByToken")
    public WrapperResponse<WeiXinUserInfo> loginByToken(String tokenStr) throws MaskException {
        return null;
    }

    private void checkUserStatus(UserPO user) throws MaskException {
        // 用户未激活
        if (CommonConstant.USER_STATUS_NO_ACTIVATION.equals(user.getStatus())) {
            throw new MaskException(ResultStatusCode.NOT_PARAM_USER_OR_ERROR_PWD,
                    ResponseCodeConstant.USER_LOGIN_FAIL_NO_ACTIVATION_MSG);
        }
        // 用户已冻结
        if (CommonConstant.USER_STATUS_FREEZE.equals(user.getStatus())) {
            throw new MaskException(ResultStatusCode.USER_FROZEN,
                    ResponseCodeConstant.USER_LOGIN_FAIL_FREEZEED_MSG);
        }
        // 用户已作废
        if (CommonConstant.USER_STATUS_CANCEL.equals(user.getStatus())) {
            throw new MaskException(ResultStatusCode.USER_FROZEN,
                    ResponseCodeConstant.USER_LOGIN_FAIL_CANCELED_MSG);
        }
    }
}