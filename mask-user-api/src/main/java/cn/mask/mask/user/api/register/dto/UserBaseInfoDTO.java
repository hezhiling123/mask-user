package cn.mask.mask.user.api.register.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 16:29:00
 */
@Data
public class UserBaseInfoDTO implements Serializable {
    private static final long serialVersionUID = 8240637774399566L;
    /**
     * 用户id
     */
    private String userId;

    /**
     * 姓名
     */
    @NotEmpty(message = "用户名称不能为空")
    private String username;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别
     */
    @NotEmpty(message = "用户性别不能为空")
    private Integer gender;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 语言
     */
    private String language;

    /**
     * 国籍
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;
}
