package cn.mask.mask.user.biz.service.useridentity.dao;

import cn.mask.mask.user.biz.service.useridentity.pojo.dto.QUserIdentityDTO;
import cn.mask.mask.user.biz.service.useridentity.pojo.po.UserIdentityPO;
import org.apache.ibatis.annotations.Param;

public interface UserIdentityMapper {
    int deleteByPrimaryKey(@Param("userId") String userId, @Param("identifyType") String identifyType);

    int insert(UserIdentityPO record);

    int insertSelective(UserIdentityPO record);

    UserIdentityPO selectByPrimaryKey(@Param("userId") String userId, @Param("identifyType") String identifyType);

    UserIdentityPO listUserIdentity(QUserIdentityDTO qUserIdentityDTO);

    int updateByPrimaryKeySelective(UserIdentityPO record);

    int updateByPrimaryKeyWithBLOBs(UserIdentityPO record);

    int updateByPrimaryKey(UserIdentityPO record);
}