package cn.mask.mask.user.biz.service.sys.sysrole.pojo.po;

import java.util.Date;

public class SysUserRolePO {
    private String userId;

    private String roleId;

    private Boolean valiFlag;

    private String updterId;

    private String updterName;

    private Date updtTime;

    private String crtorId;

    private String crtorName;

    private Date cretTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
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