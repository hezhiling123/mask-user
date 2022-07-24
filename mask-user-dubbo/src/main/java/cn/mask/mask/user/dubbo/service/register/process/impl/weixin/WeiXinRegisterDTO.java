package cn.mask.mask.user.dubbo.service.register.process.impl.weixin;

import cn.mask.mask.user.api.register.dto.RegisterDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 22:40:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeiXinRegisterDTO extends RegisterDTO {
    /**
     * 注册码
     */
    @NotBlank(message = "微信openId不可为空")
    String openId;
}
