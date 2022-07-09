package cn.mask.mask.user.dubbo.service.auth;

import cn.mask.mask.user.dubbo.dao.Oauth2ClientMapper;
import io.github.yedaxia.apidocs.ApiDoc;
import cn.mask.mask.user.api.authorize.dto.Oauth2Client;
import cn.mask.mask.user.api.authorize.service.AuthorizeService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 权限管理
 *
 * @author Jack
 * @date 2020/9/8
 */
@RestController
@ApiDoc
@RequestMapping("/user/sys/service/authorize")
@DubboService(group = "dev", version = "1.0.0")
public class AuthorizeServiceImpl implements AuthorizeService {

    @Autowired
    private Oauth2ClientMapper oauth2ClientMapper;

    /**
     * 验证oauth2.0客户端是否存在
     *
     * @param clientId  客户端id
     * @return  存在true/不存在false
     */
    @RequestMapping(value = "/checkClientId", method = RequestMethod.POST)
    @Override
    public boolean checkClientId(String clientId) {
        Oauth2Client oauth2Client = oauth2ClientMapper.findByClientId(clientId);
        return oauth2ClientMapper.findByClientId(clientId) != null;
    }

    /**
     * 验证oauth2.0密码是否正确
     *
     * @param clientSecret  客户端秘钥
     * @return  正确true/不正确false
     */
    @RequestMapping(value = "/checkClientSecret", method = RequestMethod.POST)
    @Override
    public boolean checkClientSecret(String clientSecret) {
        return oauth2ClientMapper.findBySecret(clientSecret) != null;
    }

    /**
     * 获取过期时间
     *
     * @return 过期时间
     */
    @RequestMapping(value = "/getExpireIn")
    @Override
    public long getExpireIn() {
        return 3600L;
    }

    /**
     * 根据客户端id获取鉴权客户端信息
     *
     * @param clientId  客户端id
     * @return  客户端信息
     */
    @RequestMapping(value = "/findClientByClientId", method = RequestMethod.POST)
    @Override
    public Oauth2Client findClientByClientId(String clientId) {
        return oauth2ClientMapper.findByClientId(clientId);
    }

    /**
     * 获取所有鉴权客户端信息
     *
     * @return  客户端信息map
     */
    @RequestMapping(value = "/getClientMap")
    @Override
    public Map<String, Oauth2Client> getClientMap() {
        return oauth2ClientMapper.getAll4Map();
    }
}
