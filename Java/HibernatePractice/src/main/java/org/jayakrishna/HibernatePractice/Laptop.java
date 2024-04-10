package org.jayakrishna.HibernatePractice;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	@ManyToMany
	private List<Student1> student1=new ArrayList<>();
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Student1> getStudent1() {
		return student1;
	}
	public void setStudent1(List<Student1> student1) {
		this.student1 = student1;
	}
	
	
	
	
}
