package cn.mask.mask.user.api.login.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 20:04:09
 */
@Data
public class WeiXinUserInfo implements Serializable {
    private static final long serialVersionUID = 3994383778664137154L;
    /**
     * 昵称
     */
    @NotBlank(message = "用户昵称不可为空")
    private String nickName;
    /**
     * 性别
     */
    @NotBlank(message = "性别不可为空")
    private Integer gender;
    /**
     * 语言
     */
    @NotBlank(message = "语言不可为空")
    private String language;
    /**
     * 城市
     */
    private String city;
    /**
     * 省份
     */
    private String province;
    /**
     * 国家
     */
    private String country;
}
