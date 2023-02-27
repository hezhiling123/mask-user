package cn.mask.mask.user.api.register.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 21:15:26
 */
@Data
public class RegisterResultDTO implements Serializable {
    private static final long serialVersionUID = -8938664700755238217L;

    /**
     * 用户基本信息
     */
    private UserBaseDTO userBaseDTO;
}
