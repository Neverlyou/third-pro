package com.moj.controller.admin;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class FindUserController {




    @RequestMapping("/index")
    public String login(@RequestParam String username, @RequestParam String password,
                        Model model, HttpServletRequest request){
        if (StringUtils.isBlank(username) && StringUtils.isBlank(password)) {
            model.addAttribute("error", "账号或者密码不能为空");
            return "admin/login";
        }

        return "admin/index";
    }
}
