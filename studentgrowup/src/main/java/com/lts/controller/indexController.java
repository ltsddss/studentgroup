package com.lts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping({"/", "/index.html", "/level1/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/level1/grjs")
    public String grjs() {
        return "/views/level1/grjs";
    }

    @RequestMapping("/level1/kysh")
    public String kysh() {
        return "/views/level1/kysh";
    }

    @RequestMapping("/level1/Lt")
    public String lt() {
        return "/views/level1/lt";
    }
}
