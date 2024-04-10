package org.krishna.Hospitalmanagement.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.krishna.Hospitalmanagement.entity.Person;

public class HospitalRepository {
	public void saveCustomer(Person person) {
		SessionFactory factory = org.krishna.Hospitalmanagement.util.SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(person);
		transaction.commit();
	}

}
