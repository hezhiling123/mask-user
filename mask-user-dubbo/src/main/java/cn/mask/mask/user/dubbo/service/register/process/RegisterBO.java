package cn.mask.mask.user.dubbo.service.register.process;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.register.dto.RegisterResultDTO;
import cn.mask.mask.user.api.register.dto.weixin.WeiXinRegisterDTO;
import cn.mask.mask.user.api.register.enums.RegTypeEnum;

public interface RegisterBO {

    /**
     * 微信注册
     *
     * @param weiXinRegisterDTO {@link WeiXinRegisterDTO}
     * @return 注册结果 {@link RegisterResultDTO}
     * @throws MaskException e
     */
    RegisterResultDTO registerByWeiXin(WeiXinRegisterDTO weiXinRegisterDTO) throws MaskException;

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
