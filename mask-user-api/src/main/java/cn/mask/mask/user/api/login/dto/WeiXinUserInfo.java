package cn.mask.mask.user.api.login.dto;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 20:04:09
 */
@Data
public class WeiXinUserInfo {
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 语言
     */
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
