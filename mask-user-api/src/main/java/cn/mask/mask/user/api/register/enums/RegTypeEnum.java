package cn.mask.mask.user.api.register.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 16:39:58
 */

/**
 * 注册方式枚举类
 */
@AllArgsConstructor
@Getter
public enum RegTypeEnum {

    /**
     * 用户名
     */
    USERNAME("USERNAME", "用户名"),

    /**
     * 微信
     */
    WEI_XIN("WEI_XIN", "微信"),

    /**
     * 电话号码
     */
    PHONE("PHONE", "电话号码"),

    /**
     * 邮箱
     */
    EMAIL("EMAIL", "邮箱");

    private final String type;
    private final String desc;

    public static boolean checkType(String type) {
        if (!StringUtils.isEmpty(type)) {
            for (RegTypeEnum typeEnum : RegTypeEnum.values()) {
                if (typeEnum.getType().equals(type)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
