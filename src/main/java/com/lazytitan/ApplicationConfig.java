package com.lazytitan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liubojin on 2018/1/15 18:59
 */

//SpringBootApplication :开启组件扫描和自动配置 =Configuration+ComponentScan+EnableAutoConfiguration
@SpringBootApplication
public class ApplicationConfig {
    public static void main(String[] args) {
        //负责启动引导应用程序 AppConfig.class
        SpringApplication.run(ApplicationConfig.class);

    }
}
