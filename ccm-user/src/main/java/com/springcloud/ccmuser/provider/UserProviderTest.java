package com.springcloud.ccmuser.provider;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.ccmuser.consumer.UserConsumerTest;
import com.springcloud.ccmuser.services.UserServiceTest;
import com.springcloud.ccmuser.services.impl.UserServiceTestImpl;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/1/8 0008 20:26
 */
@RestController
@RequestMapping("userProviderTest")
@Slf4j
public class UserProviderTest {

    @Autowired
    private UserConsumerTest userConsumerTest;

    @Autowired
    private UserServiceTest userServiceTest;

    static int i = 0;
    @GetMapping("test")
    @SentinelResource(value = "test")
    public String test() {
        System.out.println("测试github：");
        String str = userServiceTest.userTest(i++);
        System.out.println("Sentinel:"+ str);
        return "用户模块调用：" + userConsumerTest.orderProviderTestRemote();
    }
}
