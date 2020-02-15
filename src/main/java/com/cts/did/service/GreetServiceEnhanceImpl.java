package com.cts.did.service;

public class GreetServiceEnhanceImpl implements GreetService {
private String greeting;
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting= greeting;
	}
public String greet(String userName) {
		
		return greeting +" "+userName;
	}

}
