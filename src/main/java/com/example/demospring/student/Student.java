package com.example.demospring.student;

public class Student {
	private final Integer studentId;
	private final String studentName;
	
	public Student(Integer studentId, String student) {
		
		this.studentId = studentId;
		this.studentName = student;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
	
	

}
