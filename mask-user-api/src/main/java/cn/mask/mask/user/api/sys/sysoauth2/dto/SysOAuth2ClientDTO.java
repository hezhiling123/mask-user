package cn.mask.mask.user.api.sys.sysoauth2.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 16:31:02
 */
@Data
public class SysOAuth2ClientDTO {
    private String id;

    private String clientId;

    private String clientName;

    private String clientSecret;

    private String clientType;

    private String logoutUrl;

    private Boolean valiFlag;

    private String updterId;

    private String updterName;

    private Date updtTime;

    private String crtorId;

    private String crtorName;

    private Date cretTime;
}
