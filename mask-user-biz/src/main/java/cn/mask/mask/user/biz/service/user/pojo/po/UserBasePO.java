package cn.mask.mask.user.biz.service.user.pojo.po;

import cn.mask.mask.model.BasePO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserBasePO extends BasePO  {
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
}