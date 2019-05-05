package com.cbrl.spring.apache.cxf;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.cbrl.spring.apache.cxf.ICalculateArea")
public class CalculateImpl implements ICalculateArea {

	public Double calculateCircleArea(@WebParam(name = "radius") double radius) {
		System.out.println("Dairenin alanı hesaplandı.");
		return 3.14 * radius * radius;
	}

	public Double calculateRectangleArea(double length, double width) {
		System.out.println("Dikdörtgenin alanı hesaplandı.");
		return length * width;
	}
}