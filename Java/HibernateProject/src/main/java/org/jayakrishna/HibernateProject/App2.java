package org.jayakrishna.HibernateProject;

import java.util.ArrayList;
import java.util.List;


public class App2 {
	public static void main(String[] args) {
		Course course = new Course();
		course.setName("JAVA");
		course.setCredits("25");
		
		Course course2 = new Course();
		course2.setName("JEE");
		course2.setCredits("25");
		
		Course course3 = new Course();
		course3.setName("FrameWorks");
		course3.setCredits("25");
		
		List<Course> list=new ArrayList<>();
		list.add(course);
		list.add(course2);
		list.add(course3);
		
		Student s = new Student();
		s.setName("jay");
		s.setEmailId("jay@gmail.com");
		s.setCourses(list);
		
		Student s1 = new Student();
		s1.setName("krish");
		s1.setEmailId("krish@gmail.com");
		s1.setCourses(list);
		
		Student s2 = new Student();
		s2.setName("san");
		s2.setEmailId("san@gmail.com");
		s2.setCourses(list);
		
		List<Student> slist=new ArrayList<>();
		slist.add(s);
		slist.add(s1);
		slist.add(s2);
		
		course.setStudents(slist);
		course2.setStudents(slist);
		course3.setStudents(slist);
		
		StudentRepository repository = new StudentRepository();
		repository.saveStudent(slist);
		
		
		
		
	}
}
