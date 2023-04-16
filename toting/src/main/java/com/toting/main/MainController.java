package com.toting.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(){
        System.out.println("123123123");
        return "index";
    }

    @RequestMapping("/home")
    public String home(){
        System.out.println("3333333");
        return "home";
    }
}
