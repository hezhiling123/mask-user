package cn.mask.mask.user.biz.service.sys.sysoauth2.dao;

import cn.mask.mask.user.biz.service.sys.sysoauth2.pojo.po.SysOAuth2ClientPO;

public interface SysOAuth2ClientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOAuth2ClientPO record);

    int insertSelective(SysOAuth2ClientPO record);

    SysOAuth2ClientPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysOAuth2ClientPO record);

    int updateByPrimaryKey(SysOAuth2ClientPO record);
}