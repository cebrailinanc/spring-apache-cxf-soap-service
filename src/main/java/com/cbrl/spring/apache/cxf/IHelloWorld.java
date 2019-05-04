package com.cbrl.spring.apache.cxf;

import javax.jws.WebService;

@WebService
public interface IHelloWorld {
	String sayHello(String name);
}