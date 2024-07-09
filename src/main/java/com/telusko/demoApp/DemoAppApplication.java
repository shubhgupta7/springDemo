package com.telusko.demoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.event.DocumentEvent;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(DemoAppApplication.class, args);
		dev obj = context.getBean(dev.class);
		obj.build();
	}

}
