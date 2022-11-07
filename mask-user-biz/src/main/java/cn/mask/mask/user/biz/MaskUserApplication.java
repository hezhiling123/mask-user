package cn.mask.mask.user.biz;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@DubboComponentScan
@SpringBootApplication
@MapperScan("cn.mask.mask.user.biz.**.dao")
public class MaskUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(MaskUserApplication.class);
    }
}
