package cn.mask.mask.user.biz.service.sys.sysrole.pojo.po;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 22:10:40
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SysUserRoleDO extends SysUserRolePO {
    String roleCode;
    String roleName;
    String roleDesc;
}
