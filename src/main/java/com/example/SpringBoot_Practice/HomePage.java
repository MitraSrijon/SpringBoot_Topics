package com.example.SpringBoot_Practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    @RequestMapping("/")
    public String Greet(){
        return "Welcome to the SpringBoot practice";
    }

    @RequestMapping("/about")
    public String About(){
        return "hello I am Srijon Mitra, Exploring SpringBoot currently";
    }

}
