package com.kruu.pop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignUpController {
    @RequestMapping()
    public String signup() {
        return "signup/index";
    }
}
