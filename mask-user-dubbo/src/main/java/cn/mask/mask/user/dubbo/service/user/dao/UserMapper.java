package cn.mask.mask.user.dubbo.service.user.dao;

import cn.mask.mask.user.dubbo.service.user.pojo.po.UserPO;

public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);
}