package cn.mask.mask.user.api.login.dto;

import lombok.Data;

/**
 * @author hezhiling
 */
@Data
public class WinXinLoginInfo {
    private String code;
    private WeiXinUserInfo WeiXinUserInfo;
}
