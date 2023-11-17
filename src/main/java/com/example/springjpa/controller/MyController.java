package com.example.springjpa.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String home(){
        return "hello this is home";
    }
}
