package cn.mask.mask.user.api.sys.sysrole.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.sys.sysrole.dto.SysUserRoleDTO;
import cn.mask.mask.user.api.sys.sysrole.dto.query.QSysUserRoleDTO;

import java.util.List;

/**
 * @author hezhiling
 */
public interface ISysUserRoleService {
    /**
     * 查询用户的角色信息
     *
     * @param qSysUserRoleDTO {@link QSysUserRoleDTO}
     * @return 用户角色信息
     * @throws MaskException e
     */
    WrapperResponse<List<SysUserRoleDTO>> listSysUserRole(QSysUserRoleDTO qSysUserRoleDTO) throws MaskException;
}
