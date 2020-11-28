package com.baidu.springcloud_eureka_server_8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 使用springcloud组件规律：
 * 1、添加maven依赖
 * 2、启动类上添加@enable*****注解
 * 3、配置application.xml
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8080Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8080Application.class, args);
    }

}
