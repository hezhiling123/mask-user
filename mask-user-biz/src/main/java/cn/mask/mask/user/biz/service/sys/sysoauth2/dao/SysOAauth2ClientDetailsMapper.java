package cn.mask.mask.user.biz.service.sys.sysoauth2.dao;

import cn.mask.mask.user.biz.service.sys.sysoauth2.pojo.po.SysOAauth2ClientDetailsPO;

public interface SysOAauth2ClientDetailsMapper {
    int deleteByPrimaryKey(String clientId);

    int insert(SysOAauth2ClientDetailsPO record);

    int insertSelective(SysOAauth2ClientDetailsPO record);

    SysOAauth2ClientDetailsPO selectByPrimaryKey(String clientId);

    int updateByPrimaryKeySelective(SysOAauth2ClientDetailsPO record);

    int updateByPrimaryKey(SysOAauth2ClientDetailsPO record);
}