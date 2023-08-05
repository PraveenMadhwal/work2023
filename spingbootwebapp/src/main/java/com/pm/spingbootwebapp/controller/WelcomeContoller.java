package com.pm.spingbootwebapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeContoller {
    @RequestMapping("/welcome")
    public String welcome()

    {
        System.out.println("inside welcome controler");
        return "welcome";
    }

}
