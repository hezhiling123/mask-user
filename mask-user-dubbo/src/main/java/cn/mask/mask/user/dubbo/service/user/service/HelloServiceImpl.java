package cn.mask.mask.user.dubbo.service.user.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.user.api.user.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-09 20:42:20
 */
@RequestMapping("/test")
@RestController
@Service
public class HelloServiceImpl implements IHelloService {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @Override
    @GetMapping("sayHello")
    public WrapperResponse<String> sayHello(String name) {
        return WrapperResponse.success("hello:" + name);
    }
}