package cn.mask.mask.user.biz.service.sys.sysrole.bo.impl;

import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.sys.sysrole.dto.SysUserRoleDTO;
import cn.mask.mask.user.api.sys.sysrole.dto.query.QSysUserRoleDTO;
import cn.mask.mask.user.biz.service.sys.sysrole.bo.SysUserRoleBO;
import cn.mask.mask.user.biz.service.sys.sysrole.dao.SysUserRoleMapper;
import cn.mask.mask.user.biz.service.sys.sysrole.pojo.po.SysUserRoleDO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:47:44
 */
@Service
public class SysUserRoleBOImpl implements SysUserRoleBO {

    @Resource
    SysUserRoleMapper sysUserRoleMapper;

    /**
     * 查询用户角色信息
     *
     * @param qSysUserRoleDTO {@link QSysUserRoleDTO}
     * @return a list of {@link SysUserRoleDTO}
     * @throws MaskException e
     */
    @Override
    public List<SysUserRoleDTO> querySysUserRoleDTO(QSysUserRoleDTO qSysUserRoleDTO) throws MaskException {
        checkQueryUserRoleDTO(qSysUserRoleDTO);
        List<SysUserRoleDO> sysUserRoleDOList = sysUserRoleMapper.listSysUserRoleJoinSysRole(qSysUserRoleDTO);
        List<SysUserRoleDTO> sysUserRoleDTOList = new ArrayList<>();
        for (SysUserRoleDO sysUserRoleDO : sysUserRoleDOList) {
            SysUserRoleDTO sysUserRoleDTO = new SysUserRoleDTO();
            BeanUtils.copyProperties(sysUserRoleDO, sysUserRoleDTO);
            sysUserRoleDTOList.add(sysUserRoleDTO);
        }
        return sysUserRoleDTOList;
    }

    /**
     * 检查查询用户角色信息入参
     *
     * @param qSysUserRoleDTO {@link QSysUserRoleDTO}
     * @throws MaskException e
     */
    private void checkQueryUserRoleDTO(QSysUserRoleDTO qSysUserRoleDTO) throws MaskException {
        if (StringUtils.isEmpty(qSysUserRoleDTO.getUserId())) {
            throw new MaskException(ResultCode.REQUEST_PARAMETER_ERR, "查询用户角色信息时，用户Id为空");
        }
    }
}
