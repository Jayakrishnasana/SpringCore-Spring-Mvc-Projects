package com.StudentProject.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentProject.entity.StudentEntity;

@Repository
public class StudentRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveStudent(StudentEntity studentEntity) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(studentEntity);
		transaction.commit();
	}
}
