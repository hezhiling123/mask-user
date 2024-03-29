package cn.mask.mask.user.biz.service.user.bo;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.biz.service.user.pojo.po.OpenCreditPO;
import cn.mask.mask.user.biz.service.user.pojo.dto.QOpenCreditDTO;

import java.util.List;

public interface IOpenCreditBO {
    /**
     * 存储开放信息
     *
     * @param openCreditPO {@link OpenCreditPO} 用户开放信息
     * @throws MaskException    e
     */
    void saveOpenCredit(OpenCreditPO openCreditPO) throws MaskException;

    /**
     * 获取绑定信息
     *
     * @param qOpenCreditDTO    {@link QOpenCreditDTO} 查询条件
     * @return  e
     * @throws MaskException {@link MaskException}
     */
    List<OpenCreditPO> listOpenCredit(QOpenCreditDTO qOpenCreditDTO) throws MaskException;
}
