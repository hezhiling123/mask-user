package cn.mask.mask.user.api.register.dto;

import cn.mask.mask.user.api.register.enums.RegTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 16:37:41
 */
@Data
public class RegisterInfoDTO implements Serializable {
    private static final long serialVersionUID = 6841445141886654204L;
    /**
     * 注册渠道
     */
    @NotEmpty(message = "注册所属AppId不能为空")
    private String regAppId;

    /**
     * 注册app名称
     */
    @NotEmpty(message = "注册所属App名称不能为空")
    private String regAppName;

    /**
     * 注册方式
     */
    @NotNull(message = "注册类型不能为空")
    private RegTypeEnum regType;
}
