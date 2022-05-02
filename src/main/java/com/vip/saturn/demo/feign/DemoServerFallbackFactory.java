package com.vip.saturn.demo.feign;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoServerFallbackFactory implements FallbackFactory<DemoServerApi> {
    private final Logger logger = LoggerFactory.getLogger(DemoServerFallbackFactory.class);

    @Override
    public DemoServerApi create(Throwable throwable) {
        logger.error("fallback errorMsg:{}", throwable.getMessage());
        return new DemoServerApi() {
            @Override
            public void test() {
                logger.error("test method error");
            }
        };
    }
}
