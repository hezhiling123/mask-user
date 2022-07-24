package cn.mask.mask.user.dubbo.service.register.process;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterDTO;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import org.springframework.util.StringUtils;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-07-24 22:28:21
 */
public abstract class AbstractRegisterProcess<T extends RegisterDTO, R extends RegisterResultDTO> implements RegisterBO<T, R> {
    /**
     * 检查注册类型是否正确。
     * @param regType   注册类型
     * @throws MaskException e
     */
    @Override
    public void checkType(String regType) throws MaskException {
        if (StringUtils.isEmpty(regType)) {
            throw new MaskException("注册类型不能为空");
        }
        if (!regType.equals(getRegTypeEnum().getType())) {
            throw new MaskException("非法的注册类型");
        }
    }

    /**
     * 生成用户id
     * @return 用户id
     */
    public String generateUserId() {
        return "1";
    }
}
