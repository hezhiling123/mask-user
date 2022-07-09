package cn.mask.mask.user.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.mask.**.dao")
public class MaskUserDubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskUserDubboApplication.class);
    }
}
