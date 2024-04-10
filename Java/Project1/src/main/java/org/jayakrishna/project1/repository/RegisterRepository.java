package org.jayakrishna.project1.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jayakrishna.project1.config.MysqlConnectionUtil;
import org.jayakrishna.project1.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RegisterRepository {
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void saveUser(RegisterEntity registerEntity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
