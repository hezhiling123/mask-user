package cn.mask.mask.user.biz.service.sys.sysrole.pojo.po;

import java.util.Date;

public class SysRolePO {
    private Long roleId;

    private String roleName;

    private String roleCode;

    private String roleDesc;

    private String valiFlag;

    private String updterId;

    private String updterName;

    private Date updtTime;

    private String crtorId;

    private String crtorName;

    private Date cretTime;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getValiFlag() {
        return valiFlag;
    }

    public void setValiFlag(String valiFlag) {
        this.valiFlag = valiFlag == null ? null : valiFlag.trim();
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