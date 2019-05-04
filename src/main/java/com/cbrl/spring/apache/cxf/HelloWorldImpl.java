package com.cbrl.spring.apache.cxf;

public class HelloWorldImpl implements IHelloWorld {

	public String sayHello(String name) {
		System.out.println("Merhaba " + name);
		return "Merhaba " + name;
	}
}