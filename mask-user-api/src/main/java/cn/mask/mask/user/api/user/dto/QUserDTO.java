package cn.mask.mask.user.api.user.dto;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-24 22:19:34
 */
@Data
public class QUserDTO {
    private String userId;
    /**
     * openId
     */
    private String openId;
    /**
     * 绑定类型
     */
    private String bindType;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 邮箱
     */
    private String email;
}
