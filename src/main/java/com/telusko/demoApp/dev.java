package com.telusko.demoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class dev {


//    @Autowired //
//    Field Injection
    @Autowired
    @Qualifier("laptop")
    private Computer comp;
//    public dev(laptop laptop){
//        this.laptop=laptop;
//    }
//    @Autowired
//    public void setLaptop (laptop laptop){
//        this.laptop = laptop;
//    }
    public void build(){
        comp.compile();
        System.out.println("working on this awesome project");

    }
}
