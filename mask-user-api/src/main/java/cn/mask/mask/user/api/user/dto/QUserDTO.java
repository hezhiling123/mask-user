package cn.mask.mask.user.api.user.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-24 22:19:34
 */
@Data
public class QUserDTO implements Serializable {
    private static final long serialVersionUID = 4836086406631716335L;
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
