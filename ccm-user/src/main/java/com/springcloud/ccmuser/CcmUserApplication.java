package com.springcloud.ccmuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CcmUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcmUserApplication.class, args);
    }

}
