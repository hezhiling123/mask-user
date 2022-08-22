package cn.mask.mask.user.dubbo.service.user.pojo.enums;

import lombok.Getter;

/**
 * 用户账户状态枚举
 */
@Getter
public enum UserStatusEnum {
    /**
     * 正常
     */
    NORMAL("NORMAL", "正常"),

    /**
     * 已注销
     */
    CANCEL("CANCEL", "已注销"),

    /**
     * 已冻结
     */
    FROZEN("FROZEN", "已冻结"),

    /**
     * 未激活
     */

    NO_ACTIVATION("NO_ACTIVATION", "未激活");

    /**
     * 用户账户状态
     */
    private final String status;
    /**
     * 用户账户状态描述
     */
    private final String desc;

    UserStatusEnum(String status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
