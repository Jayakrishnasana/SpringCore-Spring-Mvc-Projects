package org.jayakrishna.HibernateProject;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentRepository {
	public void saveStudent(List<Student> slist) {
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		for(Student s:slist) {
			session.save(s);
		}
		transaction.commit();
	}
}
