package cn.mask.mask.user.dubbo;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@DubboComponentScan
@SpringBootApplication
@MapperScan("cn.mask.mask.user.dubbo.**.dao")
public class MaskUserDubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskUserDubboApplication.class);
    }
}
