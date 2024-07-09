package com.telusko.demoApp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("compiling with 404 bugs but faster");
    }
    public void debug(){
        System.out.println("dubugging my code");
    }
}
