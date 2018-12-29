package com.practice.firstapp.controller;

import com.practice.firstapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @Autowired
    private HelloService service;


    public void sayHello(){
        service.hello();
    }
}
