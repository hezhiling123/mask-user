package cn.mask.mask.user.api.register.service;


import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.dto.weixin.WeiXinRegisterDTO;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 18:04:14
 */
public interface RegisterService {

    /**
     * 微信注册
     *
     * @param registerDTO {@link WeiXinRegisterDTO}
     * @return 注册结果
     * @throws MaskException e
     */
    WrapperResponse<RegisterResultDTO> registerByWeiXin(WeiXinRegisterDTO registerDTO) throws MaskException;
}
