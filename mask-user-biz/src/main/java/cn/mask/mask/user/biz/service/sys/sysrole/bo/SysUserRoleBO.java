package cn.mask.mask.user.biz.service.sys.sysrole.bo;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.sys.sysrole.dto.SysUserRoleDTO;
import cn.mask.mask.user.api.sys.sysrole.dto.query.QSysUserRoleDTO;

import java.util.List;

/**
 * @author hezhiling
 */
public interface SysUserRoleBO {
    /**
     * 查询用户角色信息
     *
     * @param qSysUserRoleDTO {@link QSysUserRoleDTO}
     * @return  a list of {@link SysUserRoleDTO}
     * @throws MaskException e
     */
    List<SysUserRoleDTO> querySysUserRoleDTO(QSysUserRoleDTO qSysUserRoleDTO) throws MaskException;
}
