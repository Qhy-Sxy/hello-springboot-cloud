package com.aaa.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 钱浩洋
 * @date 2020/2/24 - 23:04
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi() {
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hai", String.class);
    }

    public String hiError() {
        return "Hi，your message is  request error.";
    }
}