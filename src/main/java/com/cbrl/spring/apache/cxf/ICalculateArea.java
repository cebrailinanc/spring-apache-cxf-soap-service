package com.cbrl.spring.apache.cxf;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface ICalculateArea {
	/**
	 * @WebParam(name = "radius") anotasyonu ile soap ui da görülenen değişken adı yazılır.
	 
		<soapenv:Envelope
			xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
			xmlns:cxf="http://cxf.apache.spring.cbrl.com/">
			<soapenv:Header />
			<soapenv:Body>
				<cxf:calculateCircleArea>
					<radius>9</radius>
				</cxf:calculateCircleArea>
			</soapenv:Body>
		</soapenv:Envelope>
	 
	 * @param radius
	 * @return
	 */
	Double calculateCircleArea(@WebParam(name = "radius") double radius);

	Double calculateRectangleArea(@WebParam(name = "length") double length, @WebParam(name = "width") double width);
}