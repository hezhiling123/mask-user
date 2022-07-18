package cn.mask.mask.user.api.user.service;

import cn.mask.mask.common.core.framework.web.WrapperResponse;

public interface IHelloService {
    WrapperResponse<String> sayHello(String name);
}
