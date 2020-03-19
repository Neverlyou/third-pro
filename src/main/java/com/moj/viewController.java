package com.moj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class viewController {

    @RequestMapping("/login")
    public String login(){
        System.out.println("这是一个登录测试！");
        return "login";
    }
}
