package cn.mask.mask.user.biz.service.sys.sysoauth2.pojo.po;

import lombok.Data;

import java.util.Date;

/**
 * @author hezhiling
 */
@Data
public class SysOAuth2ClientPO {
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