package com.springcloud.ccmgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CcmGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CcmGatewayApplication.class, args);
    }

}
