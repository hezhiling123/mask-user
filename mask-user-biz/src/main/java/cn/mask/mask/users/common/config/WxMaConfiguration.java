package cn.mask.mask.users.common.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.WxMaConfig;
import cn.binarywang.wx.miniapp.config.WxMaInMemoryConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(WxMaService.class)
@EnableConfigurationProperties(WxMaProperties.class)
public class WxMaConfiguration {

    @Autowired
    private WxMaProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public WxMaConfig config() {
        WxMaInMemoryConfig config = new WxMaInMemoryConfig();
        config.setAppid(this.properties.getAppId());
        config.setSecret(this.properties.getAppSecret());
        return config;
    }

    @Bean
    @ConditionalOnMissingBean
    public WxMaService wxMaService(WxMaConfig config) {
        WxMaService service = new WxMaServiceImpl();
        service.setWxMaConfig(config);
        return service;
    }

}
