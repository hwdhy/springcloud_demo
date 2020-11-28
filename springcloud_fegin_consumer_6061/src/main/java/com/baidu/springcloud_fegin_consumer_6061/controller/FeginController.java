package com.baidu.springcloud_fegin_consumer_6061.controller;

import com.baidu.springcloud_fegin_consumer_6061.server.IFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class FeginController {

    @Autowired
    private IFeginService feginService;

    @RequestMapping("/fegin")
    public String hello(){
        System.out.println("调用了方法");
        return feginService.provider("zhangsan");
    }
}
