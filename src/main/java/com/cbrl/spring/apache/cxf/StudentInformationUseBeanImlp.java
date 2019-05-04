package com.cbrl.spring.apache.cxf;

import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.cbrl.spring.apache.cxf.IStudentInformation")
public class StudentInformationUseBeanImlp implements IStudentInformation {
	private List<Student> students;

	public Student findStudent(Integer studentNumber) {
		return students.stream().filter(student -> student.getStudentNumber().equals(studentNumber)).findAny()
				.orElse(null);
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
