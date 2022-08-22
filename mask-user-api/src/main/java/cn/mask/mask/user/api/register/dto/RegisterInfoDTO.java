package cn.mask.mask.user.api.register.dto;

import cn.mask.mask.user.api.register.enums.RegTypeEnum;
import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 16:37:41
 */
@Data
public class RegisterInfoDTO {
    /**
     * 注册渠道
     */
    private String regAppId;

    /**
     * 注册app名称
     */
    private String regAppName;

    /**
     * 注册方式
     */
    private RegTypeEnum regType;
}
