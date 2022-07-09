package cn.mask.mask.user.biz.service.user.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 17:14:09
 */
@Data
public class UserDTO {
    /**
     * 名称
     */
    private String username;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 电话号码
     */
    private String tel;
}
