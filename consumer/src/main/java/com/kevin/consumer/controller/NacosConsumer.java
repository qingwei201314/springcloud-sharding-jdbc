package com.kevin.consumer.controller;

import com.kevin.consumer.provider.RestProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/nacosConsumer")
public class NacosConsumer {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestProvider restProvider;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/echo/app-name")
    public String echoAppName(){
        return restProvider.echoAppName(appName);
    }

}
