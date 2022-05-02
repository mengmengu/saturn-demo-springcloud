package com.vip.saturn.demo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-server", path = "demo-server", fallbackFactory = DemoServerFallbackFactory.class)
public interface DemoServerApi {

    @GetMapping("test")
    void test();
}
