package com.moj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class viewController {

    @RequestMapping("/login")
    public String login(){
        return "templates/login.html";
    }
}
