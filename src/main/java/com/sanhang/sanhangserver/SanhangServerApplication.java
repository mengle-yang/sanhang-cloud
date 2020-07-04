package com.sanhang.sanhangserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SanhangServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SanhangServerApplication.class, args);
    }

}
