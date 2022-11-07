package cn.mask.mask.user.api.sys.sysoauth2.service;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.sys.sysoauth2.dto.SysOAuth2ClientDTO;
import cn.mask.mask.user.api.sys.sysoauth2.dto.query.QSysOAuth2ClientDTO;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:10:36
 */
public interface SysOAuth2ClientService {
    /**
     * 查询OAuth2客户端基本信息
     *
     * @param qSysOAuth2ClientDTO   {@link QSysOAuth2ClientDTO}
     * @return  {@link SysOAuth2ClientDTO}
     * @throws MaskException e
     */
    SysOAuth2ClientDTO querySysOAuth2Client(QSysOAuth2ClientDTO qSysOAuth2ClientDTO) throws MaskException;
}
