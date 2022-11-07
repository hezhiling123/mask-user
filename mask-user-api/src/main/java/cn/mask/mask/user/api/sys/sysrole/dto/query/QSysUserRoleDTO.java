package cn.mask.mask.user.api.sys.sysrole.dto.query;

import lombok.Data;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:28:17
 */
@Data
public class QSysUserRoleDTO {
    /**
     * 用户id
     */
    private String userId;

    /**
     * 角色编码
     */
    private String roleCode;
}
