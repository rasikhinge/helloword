package com.practice.firstapp;

import com.practice.firstapp.bean.Greet;
import com.practice.firstapp.controller.HelloController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class HelloWorld extends SpringBootServletInitializer {

    @Autowired
    private Greet greet1;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorld.class);
    }

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(HelloWorld.class,args);
       HelloController controller = (HelloController) ctx.getBean("helloController");
        controller.sayHello();
        Greet greet = (Greet)ctx.getBean("greet");
        greet.geeting("Morning","Good");

        HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld");
        hw.greet1.geeting("Evening","nice");
    }

}
