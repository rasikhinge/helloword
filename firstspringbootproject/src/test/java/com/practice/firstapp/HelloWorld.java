package com.practice.firstapp;


import com.practice.firstapp.controller.HelloController;
import com.practice.firstapp.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorld {

    @Mock
   HelloService service;

    @Test
    public void test_True(){

        assertTrue(true);
    }

    @Test
    public void test_equals(){
        assertEquals("hello","hello");
    }

    @Test
    public void test_HelloController(){
        HelloController controller = new HelloController(service);
        Mockito.when(service.hello()).thenReturn("Hello");

        String actual = controller.sayHello();
        assertEquals("Hello",actual);
    }
}
