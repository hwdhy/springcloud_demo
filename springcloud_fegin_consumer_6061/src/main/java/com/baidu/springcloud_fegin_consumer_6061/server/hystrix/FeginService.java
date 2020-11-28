package com.baidu.springcloud_fegin_consumer_6061.server.hystrix;

import com.baidu.springcloud_fegin_consumer_6061.server.IFeginService;
import org.springframework.stereotype.Component;

@Component
public class FeginService implements IFeginService {

    /**
     * 该方法是降级方法-fallback
     * @param param
     * @return
     */
    @Override
    public String provider(String param) {
        return "fegin降级方法已经调用";
    }
}
