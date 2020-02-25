package com.aaa.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钱浩洋
 * @date 2020/2/24 - 22:06
 */
@Controller
public class HiController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("hai")
    @ResponseBody
    public String hai(){
        return "hai+"+port;
    }
}
