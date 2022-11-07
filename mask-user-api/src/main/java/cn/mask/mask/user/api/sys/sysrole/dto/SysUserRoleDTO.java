package cn.mask.mask.user.api.sys.sysrole.dto;

import lombok.Data;


/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:24:02
 */
@Data
public class SysUserRoleDTO {
    private Long roleId;

    private String roleName;

    private String roleCode;

    private String roleDesc;

    private String valiFlag;
}
