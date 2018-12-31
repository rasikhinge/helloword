package com.practice.firstapp.controller;
import com.practice.firstapp.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    HelloService service;

    public HelloWorldController(HelloService service) {
        this.service = service;
    }

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(){
        return "Hello";
    }
}
