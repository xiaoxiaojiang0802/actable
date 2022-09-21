package com.jiangjin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jiangjin
 */
@MapperScan(value = {"com.jiangjin.actable.core.mapper"})
@ComponentScan(basePackages = {"com.jiangjin.actable.**"})
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  jiangJin-acTable-demo启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
