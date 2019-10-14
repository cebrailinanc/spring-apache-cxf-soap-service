package com.cbrl.spring.apache.cxf;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.cbrl.spring.apache.cxf.IStudentInformation")
public class StudentInformationUseBeanImlp implements IStudentInformation {
	private List<Student> students = new ArrayList<Student>();

	public StudentInformationUseBeanImlp() {
		Student dto = new Student();
		dto.setStudentNumber(23);
		dto.setName("aCebrail");
		dto.setSurName("aİnanç");
		dto.setDepartment("aBilgisayar Mühendisliği");
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

	public Student findStudent(Integer studentNumber) {
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
