package com.telusko.demoApp;

import org.springframework.stereotype.Component;


@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs");
    }
    public void debug(){
        System.out.println("dubugging my code");
    }
}
