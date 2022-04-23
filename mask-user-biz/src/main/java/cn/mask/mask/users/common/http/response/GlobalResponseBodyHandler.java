package cn.mask.mask.users.common.http.response;

import cn.mask.core.framework.web.WrapperResponse;
import cn.mask.core.framework.web.exception.MaskException;
import cn.mask.core.framework.web.exception.ResultStatusCode;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * 全局返回类型处理类，
 *
 * @author hezhiling
 * @version 1.0
 * @date 2022-04-23 23:10:05
 */
@RestControllerAdvice
public class GlobalResponseBodyHandler implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (body instanceof WrapperResponse) {
            return body;
        }
        return WrapperResponse.success(body);
    }
}
