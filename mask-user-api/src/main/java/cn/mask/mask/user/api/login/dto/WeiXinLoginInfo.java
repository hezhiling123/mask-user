package cn.mask.mask.user.api.login.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author hezhiling
 */
@Data
public class WeiXinLoginInfo implements Serializable {
    private static final long serialVersionUID = -5072111571719505994L;
    @NotBlank(message = "微信登录授权码不能w为空")
    private String code;
    private WeiXinUserInfo weiXinUserInfo;
}
