package cn.mask.mask.user.biz.service.user.service;


import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.mask.mask.common.core.framework.web.WrapperResponse;
import cn.mask.mask.common.core.framework.web.enums.ResultCode;
import cn.mask.mask.common.core.framework.web.exception.MaskException;
import cn.mask.mask.user.api.login.dto.WeiXinUserInfo;
import cn.mask.mask.user.api.register.dto.UserBaseDTO;
import cn.mask.mask.user.api.register.enums.RegTypeEnum;
import cn.mask.mask.user.api.user.dto.QUserDTO;
import cn.mask.mask.user.api.user.service.IUserService;
import cn.mask.mask.user.biz.service.user.bo.IOpenCreditBO;
import cn.mask.mask.user.biz.service.user.bo.IUserBO;
import cn.mask.mask.user.biz.service.user.pojo.dto.QUserBaseDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.OpenCreditPO;
import cn.mask.mask.user.biz.service.user.pojo.dto.QOpenCreditDTO;
import cn.mask.mask.user.biz.service.user.pojo.po.UserBasePO;
import org.apache.dubbo.config.annotation.Service;
import org.eclipse.jetty.util.StringUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-04-11 22:05:54
 */
@Service
@RequestMapping("/api/userService")
@RestController
public class UserServiceImpl implements IUserService {

    @Resource
    IUserBO userBO;

    @Resource
    IOpenCreditBO openCreditBO;

    /**
     * 创建系统用户
     *
     * @param WeiXinUserInfo 用户信息 {@link WeiXinUserInfo}
     */
    @Override
    public void addUser(WeiXinUserInfo WeiXinUserInfo) {

    }

    /**
     * 根据用户id查询用户信息
     *
     * @param userId 用户id
     * @return 用户信息 {@link WeiXinUserInfo}
     */
    @Override
    public WrapperResponse<UserBaseDTO> getUserByUserId(String userId) throws MaskException {
        QUserBaseDTO qUserBaseDTO = new QUserBaseDTO();
        qUserBaseDTO.setUserId(userId);
        List<UserBasePO> userBasePOList = userBO.listUser(qUserBaseDTO);
        UserBaseDTO userBaseDTO = new UserBaseDTO();
        BeanUtils.copyProperties(userBasePOList.get(0), userBaseDTO);
        return WrapperResponse.success(userBaseDTO);
    }

    /**
     * 模糊查询用户信息
     *
     * @param qUserDTO {@link QUserDTO}
     * @return {@link UserBaseDTO}
     */
    @Override
    @PostMapping("/queryUserByCondition")
    public WrapperResponse<UserBaseDTO> queryUserByCondition(@RequestBody QUserDTO qUserDTO) throws MaskException {
        checkQueryUserInputCondition(qUserDTO);
        QUserBaseDTO qUserBaseDTO = new QUserBaseDTO();
        BeanUtils.copyProperties(qUserDTO, qUserBaseDTO);
        List<UserBasePO> userBasePOList = userBO.listUser(qUserBaseDTO);
        if (ObjectUtil.isNotEmpty(userBasePOList)) {
            UserBaseDTO userBaseDTO = new UserBaseDTO();
            BeanUtils.copyProperties(userBasePOList.get(0), userBaseDTO);
            return WrapperResponse.success(userBaseDTO);
        }
        if (!RegTypeEnum.checkType(qUserDTO.getBindType())) {
            throw new MaskException(ResultCode.REQUEST_PARAMETER_ERR, "绑定类型错误");
        }
        QOpenCreditDTO qOpenCreditDTO = new QOpenCreditDTO();
        qOpenCreditDTO.setOpenId(qUserDTO.getOpenId());
        qOpenCreditDTO.setBindType(qUserDTO.getBindType());
        List<OpenCreditPO> openCreditPOS = openCreditBO.listOpenCredit(qOpenCreditDTO);
        if (CollectionUtil.isEmpty(openCreditPOS)) {
            return WrapperResponse.success("未查询到用户基本信息", null);
        }
        QUserBaseDTO qUserBaseById = new QUserBaseDTO();
        qUserBaseById.setUserId(openCreditPOS.get(0).getUserId());
        List<UserBasePO> userBasePOByUserIdList = userBO.listUser(qUserBaseDTO);
        UserBaseDTO userBaseDTO = new UserBaseDTO();
        if (CollectionUtil.isNotEmpty(userBasePOByUserIdList)) {
            BeanUtils.copyProperties(userBasePOByUserIdList.get(0), userBaseDTO);
        }
        return WrapperResponse.success(userBaseDTO);
    }

    /**
     * 检查条件查询用户信息接口入参
     *
     * @param qUserDTO {@link QUserDTO}
     * @throws MaskException e
     */
    private void checkQueryUserInputCondition(QUserDTO qUserDTO) throws MaskException {
        if (StringUtils.isEmpty(qUserDTO.getOpenId())
                && StringUtils.isEmpty(qUserDTO.getPhone())
                && StringUtils.isEmpty(qUserDTO.getEmail())
                && StringUtils.isEmpty(qUserDTO.getUserId())) {
            throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "查询用户信息时，无有效查询条件");
        }
        if (StringUtil.isNotBlank(qUserDTO.getOpenId())) {
            if (StringUtils.isEmpty(qUserDTO.getBindType())) {
                throw new MaskException(ResultCode.NULL_REQUIRED_PARAMETER, "查询用户信息时，传入openId，必须指定对应的绑定类型");
            }
            if (!RegTypeEnum.checkType(qUserDTO.getBindType())) {
                throw new MaskException(ResultCode.REQUEST_PARAMETER_ERR, "查询用户信息时，非法的绑定类型");
            }
        }
    }
}
