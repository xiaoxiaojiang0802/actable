package com.jiangjin.actable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jiangjin
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DemoApplication.class);
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  jiangJin-acTable-demo启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
