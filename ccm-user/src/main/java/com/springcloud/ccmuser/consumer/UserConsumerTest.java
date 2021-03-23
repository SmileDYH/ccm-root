package com.springcloud.ccmuser.consumer;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/1/8 0008 20:26
 */
// 注册到spring容器
@Service
// 调动名称为order模块的服务接口
@FeignClient(name = "order")
public interface UserConsumerTest {
    // 调用orderProviderTest/test服务
    @RequestMapping("orderProviderTest/test")
    String orderProviderTestRemote();
}
