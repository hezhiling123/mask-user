package cn.mask.mask.user.api.sys.sysoauth2.service;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.sys.sysoauth2.dto.SysOAuth2ClientDetailsDTO;
import cn.mask.mask.user.api.sys.sysoauth2.dto.query.QSysOAuth2ClientDetailsDTO;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-10-30 21:18:36
 */
public interface SysOAuth2ClientDetailsService {
    /**
     * 查询客户端基本信息
     *
     * @param qSysOAuth2ClientDetailsDTO {@link QSysOAuth2ClientDetailsDTO}
     * @return {@link SysOAuth2ClientDetailsDTO}
     */
    SysOAuth2ClientDetailsDTO querySysOAuth2Client(QSysOAuth2ClientDetailsDTO qSysOAuth2ClientDetailsDTO) throws MaskException;
}
