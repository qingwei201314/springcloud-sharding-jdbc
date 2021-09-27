package com.kevin.consumer.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *  Rest微服务的Provider
 *  @Author: Kevin Zhang @Date: 2021-9-27 8:24
**/
@Service
public class RestProvider {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    private String getPath(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("rest");
        String path = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort());
        return path;
    }

    public String echoAppName(String appName){
        return restTemplate.getForObject(getPath() + "/echo/" + appName, String.class);
    }
}
