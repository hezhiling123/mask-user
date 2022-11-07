package cn.mask.mask.user.biz.service.sys.sysrole.service.impl;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.sys.sysrole.dto.SysUserRoleDTO;
import cn.mask.mask.user.api.sys.sysrole.dto.query.QSysUserRoleDTO;
import cn.mask.mask.user.api.sys.sysrole.service.ISysUserRoleService;
import cn.mask.mask.user.biz.service.sys.sysrole.bo.SysUserRoleBO;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 15:08:45
 */
@Service
public class SysUserRoleServiceImpl implements ISysUserRoleService {

    @Resource
    SysUserRoleBO sysUserRoleBO;

    /**
     * 查询用户的角色信息
     *
     * @param qSysUserRoleDTO {@link QSysUserRoleDTO}
     * @return 用户角色信息
     * @throws MaskException e
     */
    @Override
    public WrapperResponse<List<SysUserRoleDTO>> listSysUserRole(QSysUserRoleDTO qSysUserRoleDTO) throws MaskException {
        List<SysUserRoleDTO> sysUserRoleDTOList = sysUserRoleBO.querySysUserRoleDTO(qSysUserRoleDTO);
        return WrapperResponse.success(sysUserRoleDTOList);
    }
}
