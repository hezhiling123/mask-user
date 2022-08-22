package cn.mask.mask.user.api.register.dto;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 16:29:00
 */
@Data
public class UserBaseInfoDTO {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 姓名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 性别
     */
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
