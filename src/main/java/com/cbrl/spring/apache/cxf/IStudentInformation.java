package com.cbrl.spring.apache.cxf;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IStudentInformation {
	
	@WebMethod(operationName="findStudentMetot")
	Student findStudent(@WebParam(name = "studentNumber") Integer studentNumber);
    
	List<Student> getAllStudent();
}