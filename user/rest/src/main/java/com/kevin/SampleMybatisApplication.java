package com.kevin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SampleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleMybatisApplication.class, args);
    }
}
