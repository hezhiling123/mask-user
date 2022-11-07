package cn.mask.mask.user.biz.service.user.dao;

import cn.mask.mask.user.biz.service.user.pojo.dto.QOpenCreditDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.OpenCreditPO;

import java.util.List;

public interface OpenCreditMapper {
    int deleteByPrimaryKey(String id);

    int insert(OpenCreditPO record);

    int insertSelective(OpenCreditPO record);

    OpenCreditPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OpenCreditPO record);

    int updateByPrimaryKey(OpenCreditPO record);

    /**
     * 批量查询绑定信息
     * @param qOpenCreditDTO {@link QOpenCreditDTO}
     * @return a list of {@link OpenCreditPO}
     */
    List<OpenCreditPO> listOpenCredit(QOpenCreditDTO qOpenCreditDTO);
}