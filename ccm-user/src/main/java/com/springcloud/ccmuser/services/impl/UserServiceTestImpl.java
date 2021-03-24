package com.springcloud.ccmuser.services.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.ccmuser.services.UserServiceTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * description: dyh
 * author: Administrator
 * date: 2021/1/8 0008 20:26
 */
@Service
@Slf4j
public class UserServiceTestImpl implements UserServiceTest {

    /**
     * 测试限流降级（Sentinel）
     *
     * @param i
     */
    @Override
    @SentinelResource(value = "userTest", blockHandler = "exceptionHandler", fallback = "fallbackHandler")
    public String userTest(int i) {
        System.out.println("userTest:" + i);
        return "succeed";
    }

    // 限流与阻塞处理
    public String exceptionHandler(int str, BlockException ex) {
        log.error("blockHandler：" + str, ex);
        return "流量限制，请稍后重试";
    }

    public void fallbackHandler(int str) {
        log.error("fallbackHandler：" + str);
    }

}
