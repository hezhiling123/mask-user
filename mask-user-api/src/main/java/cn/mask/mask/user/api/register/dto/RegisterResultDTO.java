package cn.mask.mask.user.api.register.dto;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 21:15:26
 */
@Data
public class RegisterResultDTO {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 手机号
     */
    private String phone;
}
