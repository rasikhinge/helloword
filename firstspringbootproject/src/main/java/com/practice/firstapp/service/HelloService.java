package com.practice.firstapp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        System.out.print("Hello");
        return "Hello";
    }
}
