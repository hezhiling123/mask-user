package cn.mask.mask.user.dubbo.service.register.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterDTO;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.dto.weixin.WeiXinRegisterDTO;
import cn.mask.mask.user.api.register.service.RegisterService;
import cn.mask.mask.user.dubbo.service.register.process.impl.weixin.WeiXinRegisterBOImpl;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/api/registerService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private WeiXinRegisterBOImpl weiXinRegisterBOImpl;

    /**
     * 微信注册
     *
     * @param registerDTO {@link RegisterDTO}
     * @return 注册结果
     * @throws MaskException e
     */
    @Override
    @PostMapping("/registerByWeiXin")
    public WrapperResponse<RegisterResultDTO> registerByWeiXin(@RequestBody WeiXinRegisterDTO registerDTO) throws MaskException {
        return WrapperResponse.success(weiXinRegisterBOImpl.registerByWeiXin(registerDTO));
    }
}
