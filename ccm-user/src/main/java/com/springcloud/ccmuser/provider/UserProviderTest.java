package com.springcloud.ccmuser.provider;

import com.springcloud.ccmuser.consumer.UserConsumerTest;
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
public class UserProviderTest {
    @Autowired
    private UserConsumerTest userConsumerTest;
    @GetMapping("test")
    public String test() {
        return "用户模块调用：" + userConsumerTest.orderProviderTestRemote();
    }

}
