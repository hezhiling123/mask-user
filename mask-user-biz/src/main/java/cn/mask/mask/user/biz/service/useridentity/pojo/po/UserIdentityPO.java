package cn.mask.mask.user.biz.service.useridentity.pojo.po;

import java.util.Date;

public class UserIdentityPO {
    private String userId;

    private String identifyType;

    private Integer id;

    private String identifer;

    private String credential;

    private String salt;

    private String crterId;

    private Date crteTime;

    private String updterId;

    private String updterName;

    private Date updtTime;

    private byte[] crterName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType == null ? null : identifyType.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifer() {
        return identifer;
    }

    public void setIdentifer(String identifer) {
        this.identifer = identifer == null ? null : identifer.trim();
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getCrterId() {
        return crterId;
    }

    public void setCrterId(String crterId) {
        this.crterId = crterId == null ? null : crterId.trim();
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

    public byte[] getCrterName() {
        return crterName;
    }

    public void setCrterName(byte[] crterName) {
        this.crterName = crterName;
    }
}