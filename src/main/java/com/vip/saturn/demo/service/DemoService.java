package com.vip.saturn.demo.service;

import com.vip.saturn.demo.feign.DemoServerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoService {
    @Resource
    private DemoServerApi demoServerApi;

    private static final Logger log = LoggerFactory.getLogger(DemoService.class);

    public void doing() {
        System.out.println(demoServerApi);
        log.info("demoServerApi: {}", demoServerApi);
        log.info("--------DemoService is doing...");
    }

}
