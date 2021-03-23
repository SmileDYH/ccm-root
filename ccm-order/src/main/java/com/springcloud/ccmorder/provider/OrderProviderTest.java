package com.springcloud.ccmorder.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: dyh
 * author: Administrator
 * date: 2020/12/31 0031 17:59
 */
@RestController
@RequestMapping("orderProviderTest")
// 动态刷新配置注解 配置相关后面会介绍到
@RefreshScope
public class OrderProviderTest {
    // 配置相关后面会介绍到
    @Value("${user.namex}")
    private String name;
    // 配置相关后面会介绍到
    @Value("${user.age}")
    private String age;

    @GetMapping("test")
    public String test() {
        System.out.println("order服务 == /orderProviderTest/test接口");
        return "order 服務的返回的數據:" + age +" "+ name;
    }

}

