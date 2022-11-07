package cn.mask.mask.user.api.sys.sysoauth2.dto.query;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:07:43
 */
@Data
public class QSysOAuth2ClientDetailsDTO {
    /**
     * 客户端id
     */
    private String clientId;
    /**
     * 有效标志，0无效，1有效
     */
    private String valiFlag;
}
