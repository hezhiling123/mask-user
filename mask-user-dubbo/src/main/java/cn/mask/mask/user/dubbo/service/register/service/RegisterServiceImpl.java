package cn.mask.mask.user.dubbo.service.register.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterDTO;
import cn.mask.mask.user.api.register.dto.RegisterInfoDTO;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.service.RegisterService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/api/registerService")
public class RegisterServiceImpl implements RegisterService {
    /**
     * 注册接口
     *
     * @param registerDTO 注册信息
     * @return {@link RegisterInfoDTO}
     * @throws MaskException e
     */
    @Override
    @PostMapping("/register")
    public WrapperResponse<RegisterResultDTO> register(RegisterDTO registerDTO) throws MaskException {
        return null;
    }
}
