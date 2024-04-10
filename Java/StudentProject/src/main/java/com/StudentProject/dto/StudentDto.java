package com.StudentProject.dto;

public class StudentDto {
	private int studentId;
	private String studentName;
	private String contactNumber;
	private String email;
	private String password;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentDto [studentId=" + studentId + ", studentName=" + studentName + ", contactNumber="
				+ contactNumber + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
}
