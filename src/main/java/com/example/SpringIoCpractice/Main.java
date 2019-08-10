package com.example.SpringIoCpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

//TODO
@Component
public class Main{

    public void testMain(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("hello.xml");
       HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("HelloWorldBean");
        helloWorld.getHello();
    }
}
