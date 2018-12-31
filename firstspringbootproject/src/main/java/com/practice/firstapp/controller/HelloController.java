package com.practice.firstapp.controller;

import com.practice.firstapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    public String sayHello(){
        return service.hello();
    }
}
