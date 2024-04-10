package org.jayakrishna.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BankRepository {
	public void saveCustomer(Customer customer) {
		SessionFactory factory = SessionFactoryUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(customer);
		transaction.commit();
	}
}
