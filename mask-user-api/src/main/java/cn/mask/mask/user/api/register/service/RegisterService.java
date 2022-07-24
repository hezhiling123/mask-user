package cn.mask.mask.user.api.register.service;


import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterDTO;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-05-01 18:04:14
 */
public interface RegisterService {
    /**
     * 注册接口
     *
     * @param registerDTO   注册信息
     * @return  {@link cn.mask.mask.user.api.register.dto.RegisterInfoDTO}
     * @throws MaskException e
     */
    WrapperResponse<RegisterResultDTO> register(RegisterDTO registerDTO) throws MaskException;
}
