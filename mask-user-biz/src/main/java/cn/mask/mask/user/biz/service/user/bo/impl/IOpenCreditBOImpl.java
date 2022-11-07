package cn.mask.mask.user.biz.service.user.bo.impl;

import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.biz.service.user.bo.IOpenCreditBO;
import cn.mask.mask.user.biz.service.user.pojo.dto.QOpenCreditDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.OpenCreditPO;
import cn.mask.mask.user.biz.service.user.dao.OpenCreditMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-02 22:06:44
 */
@Service
public class IOpenCreditBOImpl implements IOpenCreditBO {
    @Resource
    OpenCreditMapper openCreditMapper;

    /**
     * 存储开放信息
     *
     * @param openCreditPO {@link OpenCreditPO} 用户开放信息
     * @throws MaskException e
     */
    @Override
    public void saveOpenCredit(OpenCreditPO openCreditPO) throws MaskException {
        openCreditMapper.insert(openCreditPO);
    }

    /**
     * 获取绑定信息
     *
     * @param qOpenCreditDTO {@link QOpenCreditDTO} 查询条件
     * @return e
     * @throws MaskException {@link MaskException} e
     */
    @Override
    public List<OpenCreditPO> listOpenCredit(QOpenCreditDTO qOpenCreditDTO) throws MaskException {
        return openCreditMapper.listOpenCredit(qOpenCreditDTO);
    }
}
