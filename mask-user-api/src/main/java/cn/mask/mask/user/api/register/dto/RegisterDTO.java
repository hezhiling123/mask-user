package cn.mask.mask.user.api.register.dto;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 15:37:59
 */
@Data
public class RegisterDTO {
    /**
     * 用户基本信息
     */
    UserBaseInfo userBaseInfo;

    /**
     * 注册信息
     */
    RegisterInfoDTO registerInfoDTO;
}
