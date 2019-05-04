package com.cbrl.spring.apache.cxf;

import javax.jws.WebService;

@WebService
public interface ICalculateArea {
	Double calculateCircleArea(double radius);

	Double calculateRectangleArea(double length, double width);
}