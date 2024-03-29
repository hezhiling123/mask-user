package cn.mask.mask.user.api.register.dto.weixin;

import cn.mask.mask.user.api.register.dto.RegisterDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 16:36:49
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeiXinRegisterDTO extends RegisterDTO implements Serializable {
    private static final long serialVersionUID = 5726456970763117004L;
    /**
     * 注册码
     */
    @NotBlank(message = "微信openId不可为空")
    String openId;
}
