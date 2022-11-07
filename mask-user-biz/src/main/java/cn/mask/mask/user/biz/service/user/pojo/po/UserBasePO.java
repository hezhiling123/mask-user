package cn.mask.mask.user.biz.service.user.pojo.po;

import java.util.Date;

public class UserBasePO {
    private String userId;

    private String username;

    private Integer gender;

    private Date bitrh;

    private String tel;

    private String email;

    private String avatarUrl;

    private String status;

    private String crteAppId;

    private String crteType;

    private String crtorId;

    private String crtorName;

    private Date crteTime;

    private String updterId;

    private String updterName;

    private Date updtTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBitrh() {
        return bitrh;
    }

    public void setBitrh(Date bitrh) {
        this.bitrh = bitrh;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCrteAppId() {
        return crteAppId;
    }

    public void setCrteAppId(String crteAppId) {
        this.crteAppId = crteAppId == null ? null : crteAppId.trim();
    }

    public String getCrteType() {
        return crteType;
    }

    public void setCrteType(String crteType) {
        this.crteType = crteType == null ? null : crteType.trim();
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

    public Date getCrteTime() {
        return crteTime;
    }

    public void setCrteTime(Date crteTime) {
        this.crteTime = crteTime;
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
}