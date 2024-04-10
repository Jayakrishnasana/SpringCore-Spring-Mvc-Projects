package org.jayakrishna.HibernatePractice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable{
	
	@Id
	@Column(name="STudent_Id")
	private int id;
	@Column(name="Student_Name")
	private StudentName name;
	@Column(name="Student_Email")
	private String email;
	@Column(name="Student_Number")
	private long number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public StudentName getName() {
		return name;
	}
	public void setName(StudentName name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}
	
	
}
