package cn.mask.mask.user.api.user.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 17:14:09
 */
@Data
public class UserDTO implements Serializable {
    private static final long serialVersionUID = -5806027957455313597L;
    /**
     * 用户id
     */
    private String userId;

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
