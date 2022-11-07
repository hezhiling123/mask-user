package cn.mask.mask.user.api.sys.sysoauth2.dto.query;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:04:27
 */
@Data
public class QSysOAuth2ClientDTO {
    /**
     * 客户端id
     */
    private String clientId;

    /**
     * 有效标志
     */
    private String valiFlag;
}
