package com.aaa.controller;

import com.aaa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 钱浩洋
 * @date 2020/2/24 - 23:07
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("hai")
    @ResponseBody
    public String sayHi() {
        return adminService.sayHi()+"ribbon方式的访问!!!";
    }
}
