package cn.mask.mask.user.api.login.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author hezhiling
 */
@Data
public class WeiXinLoginInfo {
    @NotBlank(message = "微信登录授权码不能w为空")
    private String code;
    private WeiXinUserInfo weiXinUserInfo;
}
