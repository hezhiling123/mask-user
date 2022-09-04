package cn.mask.mask.user.api.register.dto;

import lombok.Data;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 15:37:59
 */
@Data
public class RegisterDTO implements Serializable {
    private static final long serialVersionUID = 7339242218843156913L;
    /**
     * 用户基本信息
     */
    @Valid
    UserBaseInfoDTO userBaseInfo;

    /**
     * 注册信息
     */
    @Valid
    RegisterInfoDTO registerInfo;
}
