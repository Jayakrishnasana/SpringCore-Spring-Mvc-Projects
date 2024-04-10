package org.jayakrishna.umss.repository;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jayakrishna.umss.entity.RegisterEntity;
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
	
	public List<RegisterEntity> findAllUser() {
		
		List<RegisterEntity> entity=null;
		try {
			
//			String sqlQuery=" from RegisterEntiy";
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			entity= session.createQuery("from RegisterEntity").list();
			transaction.commit();
		return entity;	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
