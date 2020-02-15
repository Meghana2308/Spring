package com.cts.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.did.service.GreetService;


public class DidApp01 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("beans1.xml");
		GreetService gs= (GreetService) context.getBean("g1");
		System.out.println(gs.greet("meghana"));
		
		GreetService gs1=(GreetService) context.getBean("g2");
		System.out.println(gs1.greet("sagar"));
	}
}



