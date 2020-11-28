package com.baidu.springcloud_fegin_consumer_6061.server;

import com.baidu.springcloud_fegin_consumer_6061.server.hystrix.FeginService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "server-provider",fallback = FeginService.class)
public interface IFeginService {

    @RequestMapping("/provider/hello/{params}")
    String provider(@PathVariable("params") String param);

}
