package com.baidu.springcloud_config_client_10080.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * bootstrap.yml 和 application.yml的区别
 *
 * bootstrap.yml是一个系统级的配置文件
 * application.yml是一个用户级的配置文件
 *
 */

@RestController
@RequestMapping("/config")
public class MyController {

    @Value("${com.name}")
    private String name;

    @RequestMapping("/test")
    public String test(){
        return "获取到的配置信息为："+name;
    }
}
