package cn.mask.mask.user.dubbo.service.user.pojo.dto;

import cn.mask.mask.user.dubbo.service.user.pojo.enums.UserStatusEnum;
import lombok.Data;

import java.util.List;

/**
 * @author hezhiling
 * @version 1.0
 * @date 2022-08-20 07:52:06
 */
@Data
public class QUserBaseDTO {
    private String userId;
    private String username;
    private String tel;
    private String email;
    List<UserStatusEnum> userStatusEnumList;
}
