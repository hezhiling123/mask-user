package cn.mask.mask.user.dubbo.service.user.dao;

import cn.mask.mask.user.dubbo.service.user.pojo.dto.QUserBaseDTO;
import cn.mask.mask.user.dubbo.service.user.pojo.po.UserBasePO;

import java.util.List;

public interface UserBaseMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserBasePO record);

    int insertSelective(UserBasePO record);

    UserBasePO selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserBasePO record);

    int updateByPrimaryKey(UserBasePO record);

    /**
     * 列出用户基本信息
     * @param qUserBaseDTO {@link QUserBaseDTO}
     * @return a list of {@link UserBasePO}
     */
    List<UserBasePO> listUserByQUserBaseDTO(QUserBaseDTO qUserBaseDTO);
}