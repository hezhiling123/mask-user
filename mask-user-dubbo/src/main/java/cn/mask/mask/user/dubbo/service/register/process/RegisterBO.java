package cn.mask.mask.user.dubbo.service.register.process;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.enums.RegTypeEnum;

public interface RegisterBO<T, R> {
    /**
     * 注册
     * @param t   注册信息
     * @return 注册结果信息
     * @throws MaskException e
     */
    R register(T t) throws MaskException;

    /**
     * 获取接口实现类支持的注册类型
     *
     * @return {@link RegTypeEnum}
     */
    RegTypeEnum getRegTypeEnum();

    /**
     * 检查注册类型是否正确。
     * @param regType   注册类型
     * @throws MaskException e
     */
    void checkType(String regType) throws MaskException;
}
