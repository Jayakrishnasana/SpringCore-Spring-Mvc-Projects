package springmvc.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositoryClass {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(EntityClass e) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(e);
			transaction.commit();
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
	}
}
