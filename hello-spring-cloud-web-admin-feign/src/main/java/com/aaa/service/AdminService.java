package com.aaa.service;

import com.aaa.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钱浩洋
 * @date 2020/2/24 - 23:32
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
    @RequestMapping("hai")
    @ResponseBody
    String sayHi();
}
