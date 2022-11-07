package cn.mask.mask.user.biz.service.sys.sysrole.dao;

import cn.mask.mask.user.api.sys.sysrole.dto.query.QSysUserRoleDTO;
import cn.mask.mask.user.biz.service.sys.sysrole.pojo.po.SysUserRoleDO;
import cn.mask.mask.user.biz.service.sys.sysrole.pojo.po.SysUserRolePO;
import cn.mask.mask.user.biz.service.sys.sysrole.pojo.po.SysUserRolePOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserRoleMapper {
    long countByExample(SysUserRolePOExample example);

    int deleteByExample(SysUserRolePOExample example);

    int deleteByPrimaryKey(@Param("userId") String userId, @Param("roleId") String roleId);

    int insert(SysUserRolePO record);

    int insertSelective(SysUserRolePO record);

    List<SysUserRolePO> selectByExample(SysUserRolePOExample example);

    SysUserRolePO selectByPrimaryKey(@Param("userId") String userId, @Param("roleId") String roleId);

    int updateByExampleSelective(@Param("record") SysUserRolePO record, @Param("example") SysUserRolePOExample example);

    int updateByExample(@Param("record") SysUserRolePO record, @Param("example") SysUserRolePOExample example);

    int updateByPrimaryKeySelective(SysUserRolePO record);

    int updateByPrimaryKey(SysUserRolePO record);

    /**
     * 查询用户角色信息（包含角色描述等）
     * @param qSysUserRoleDTO 查询信息 {@link QSysUserRoleDTO}
     * @return {@link SysUserRoleDO}
     */
    List<SysUserRoleDO> listSysUserRoleJoinSysRole(@Param("qSysUserRoleDTO") QSysUserRoleDTO qSysUserRoleDTO);
}