package com.moj.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/system")
public class GotoController {
    //跳转中心

    //登录界面跳转
    @RequestMapping("/toLogin")
    public String login(){
        return "login";
    }

    @RequestMapping("/toAside")
    public String aside(){
        return "aside";
    }

    @RequestMapping("/toCollection")
    public String collection(){
        return "collection";
    }

    @RequestMapping("/toError")
    public String error(){
        return "error";
    }

    @RequestMapping("/toHome")
    public String home(){
        return "home";
    }

    @RequestMapping("/forget/forgetPassword")
    public String forgetPassword(){
        return  "forget/forgetPassword";
    }

    @RequestMapping("/forget/forgetPassword2")
    public String forgetPassword2(){
        return  "forget/forgetPassword2";
    }

    @RequestMapping("/forget/forgetPassword3")
    public String forgetPassword3(){
        return  "forget/forgetPassword3";
    }
}
