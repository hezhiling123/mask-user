package cn.mask.mask.user.biz.service.login.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import cn.mask.mask.user.api.login.service.LoginService;
import cn.mask.mask.user.biz.service.user.bo.IUserBO;
import cn.mask.mask.user.biz.service.user.pojo.enums.UserStatusEnum;
import cn.mask.mask.user.biz.service.user.pojo.po.UserBasePO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
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
    @Resource
    private IUserBO IUserBO;


    /**
     * 通过token登录
     *
     * @param tokenStr token
     * @return {@link WeiXinUserInfo}
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

    private void checkUserStatus(UserBasePO user) throws MaskException {
        // 用户未激活
        //todo
        // 用户已冻结
        if (UserStatusEnum.FROZEN.getStatus().equals(user.getStatus())) {
            throw new MaskException(ResultCode.USER_ACCOUNT_FROZEN);
        }
        // 用户已作废
        if (UserStatusEnum.CANCEL.getStatus().equals(user.getStatus())) {
            throw new MaskException(ResultCode.USER_ACCOUNT_CANCEL);
        }
    }
}