package cn.mask.mask.user.biz.service.sys.sysoauth2.pojo.po;

import java.util.Date;

public class SysOAauth2ClientDetailsPO {
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    public String getScop() {
        return scop;
    }

    public void setScop(String scop) {
        this.scop = scop == null ? null : scop.trim();
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes == null ? null : authorizedGrantTypes.trim();
    }

    public String getWebServerRedirectUri() {
        return webServerRedirectUri;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri == null ? null : webServerRedirectUri.trim();
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation == null ? null : additionalInformation.trim();
    }

    public String getAutoapprove() {
        return autoapprove;
    }

    public void setAutoapprove(String autoapprove) {
        this.autoapprove = autoapprove == null ? null : autoapprove.trim();
    }

    public Boolean getValiFlag() {
        return valiFlag;
    }

    public void setValiFlag(Boolean valiFlag) {
        this.valiFlag = valiFlag;
    }

    public String getUpdterId() {
        return updterId;
    }

    public void setUpdterId(String updterId) {
        this.updterId = updterId == null ? null : updterId.trim();
    }

    public String getUpdterName() {
        return updterName;
    }

    public void setUpdterName(String updterName) {
        this.updterName = updterName == null ? null : updterName.trim();
    }

    public Date getUpdtTime() {
        return updtTime;
    }

    public void setUpdtTime(Date updtTime) {
        this.updtTime = updtTime;
    }

    public String getCrtorId() {
        return crtorId;
    }

    public void setCrtorId(String crtorId) {
        this.crtorId = crtorId == null ? null : crtorId.trim();
    }

    public String getCrtorName() {
        return crtorName;
    }

    public void setCrtorName(String crtorName) {
        this.crtorName = crtorName == null ? null : crtorName.trim();
    }

    public Date getCretTime() {
        return cretTime;
    }

    public void setCretTime(Date cretTime) {
        this.cretTime = cretTime;
    }
}