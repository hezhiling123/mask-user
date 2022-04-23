package cn.mask.mask.users.common.exception;

import cn.mask.core.framework.web.WrapperResponse;
import cn.mask.core.framework.web.exception.MaskException;
import cn.mask.core.framework.web.exception.ResultStatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.rmi.AccessException;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-04-12 22:22:49
 */
@ControllerAdvice
@ResponseBody
public class UserHandlerExceptionResolver {

    @ExceptionHandler(AccessException.class)
    private WrapperResponse<Object> handleAccessException(AccessException e) {
        return WrapperResponse.error(ResultStatusCode.UNAUTHO_ERROR.getCode(), e.getMessage(), null);
    }

    @ExceptionHandler(MaskException.class)
    private WrapperResponse<Object> handleMaskException(MaskException e) {
        return WrapperResponse.error(e.getCode(), e.getMessage(), null);
    }

    @ExceptionHandler(Exception.class)
    private WrapperResponse<Object> handleException(Exception e) {
        return WrapperResponse.error(ResultStatusCode.HTTP_ERROR_500.getCode(), e.getMessage(), null);
    }
}
