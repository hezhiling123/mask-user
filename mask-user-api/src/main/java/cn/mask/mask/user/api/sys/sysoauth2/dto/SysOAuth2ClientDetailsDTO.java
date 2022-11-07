package cn.mask.mask.user.api.sys.sysoauth2.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 16:44:37
 */
@Data
public class SysOAuth2ClientDetailsDTO {
    private String clientId;

    private String resourceIds;

    private String clientSecret;

    private String scop;

    private String authorizedGrantTypes;

    private String webServerRedirectUri;

    private String authorities;

    private Integer accessTokenValidity;

    private Integer refreshTokenValidity;

    private String additionalInformation;

    private String autoapprove;

    private Boolean valiFlag;

    private String updterId;

    private String updterName;

    private Date updtTime;

    private String crtorId;

    private String crtorName;

    private Date cretTime;
}
