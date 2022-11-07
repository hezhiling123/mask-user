package cn.mask.mask.user.biz.service.sys.sysrole.dao;

import cn.mask.mask.user.api.sys.sysrole.dto.query.QSysUserRoleDTO;
import cn.mask.mask.user.biz.service.sys.sysrole.pojo.po.SysRolePO;

import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(SysRolePO record);

    int insertSelective(SysRolePO record);

    SysRolePO selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(SysRolePO record);

    int updateByPrimaryKey(SysRolePO record);

    /**
     * 列出角色信息
     *
     * @param qSysUserRoleDTO   用户角色信息
     * @return  a list of {@link SysRolePO}
     */
    List<SysRolePO> listSysRole(QSysUserRoleDTO qSysUserRoleDTO);
}