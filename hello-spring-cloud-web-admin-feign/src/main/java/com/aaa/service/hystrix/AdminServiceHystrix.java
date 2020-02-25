package com.aaa.service.hystrix;

import com.aaa.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author 钱浩洋
 * @date 2020/2/25 - 0:08
 */
@Component
public class AdminServiceHystrix  implements AdminService {

    @Override
    public String sayHi() {
        return "Hi，your message is  request error.";
    }
}