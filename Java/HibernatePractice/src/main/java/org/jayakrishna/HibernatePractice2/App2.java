package org.jayakrishna.HibernatePractice2;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("krishna");
		student.setEmail("krishna@gmail.com");
		
		Book book = new Book();
		book.setName("Bharatham");
		book.setPrice(25);
		book.setS(student);
		student.setB(book);
		
		Configuration c = new Configuration();
		Properties connect = ConnectionUtil.connect();
		c.addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
		c.setProperties(connect);
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		session.save(book);
		System.out.println(student);
		System.out.println(book);
		transaction.commit();
	}

}
