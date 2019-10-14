package com.cbrl.spring.apache.cxf;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.cbrl.spring.apache.cxf.IStudentInformation")
public class StudentInformationImpl implements IStudentInformation {
	private List<Student> students = new ArrayList<Student>();

	public StudentInformationImpl() {
		Student dto = new Student();
		dto.setStudentNumber(23);
		dto.setName("Cebrail");
		dto.setSurName("İnanç");
		dto.setDepartment("Bilgisayar Mühendisliği");
		dto.setGender(Gender.Male);
		dto.setConsultant("Dr. Mine Elif KARSLIGİL");
		students.add(dto);

		dto = new Student();
		dto.setStudentNumber(24);
		dto.setName("Muhammed");
		dto.setSurName("xyz");
		dto.setDepartment("Bilgisayar Mühendisliği");
		dto.setGender(Gender.Male);
		dto.setConsultant("Dr. Mine Elif KARSLIGİL");
		students.add(dto);

		dto = new Student();
		dto.setStudentNumber(25);
		dto.setName("Mine");
		dto.setSurName("xyz");
		dto.setDepartment("Bilgisayar Mühendisliği");
		dto.setGender(Gender.Female);
		dto.setConsultant("Dr. Cebrail");
		students.add(dto);

		dto = new Student();
		dto.setStudentNumber(26);
		dto.setName("Zeynep");
		dto.setSurName("İstanbul");
		dto.setDepartment("Çevre Mühendisliği");
		dto.setGender(Gender.Female);
		dto.setConsultant("Dr. Erdal");
		students.add(dto);
	}

	@WebMethod
	public Student findStudent(@WebParam(name = "studentNumber") Integer studentNumber) {
		for (Student dto : students) {
			if (dto.getStudentNumber().equals(studentNumber)) {
				return dto;
			}
		}
		return null;
	}

	public List<Student> getAllStudent() {
		return students;
	}
}