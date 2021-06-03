package com.lts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "views/login";
    }

//

}
