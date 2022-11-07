package cn.mask.mask.user.biz.service.user.bo;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterInfoDTO;
import cn.mask.mask.user.api.register.dto.UserBaseInfoDTO;
import cn.mask.mask.user.biz.service.user.pojo.dto.QUserBaseDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.UserBasePO;

import java.util.List;

public interface IUserBO {
    /**
     * 添加用户基本信息
     *
     * @param userBaseInfoDTO {@link UserBaseInfoDTO}
     * @throws MaskException    e
     */
    void addUser(UserBaseInfoDTO userBaseInfoDTO, RegisterInfoDTO registerInfoDTO) throws MaskException;

    /**
     * 批量查询用户信息
     * @param qUserBaseDTO {@link QUserBaseDTO} 查询信息
     * @return  {@link UserBasePO} 用户信息
     * @throws MaskException e
     */
    List<UserBasePO> listUser(QUserBaseDTO qUserBaseDTO) throws MaskException;
}
