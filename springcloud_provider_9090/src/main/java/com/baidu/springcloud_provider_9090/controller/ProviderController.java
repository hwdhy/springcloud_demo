package com.baidu.springcloud_provider_9090.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
@RefreshScope
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @Value("${my.name}")
    private String name;

    @RequestMapping("/hello/{params}")
    public String provider(@PathVariable("params") String param){

        System.out.println("获得的参数为：" + param);
        return name + "成功调用了提供者，提供者的端口：" + port ;
    }
}
