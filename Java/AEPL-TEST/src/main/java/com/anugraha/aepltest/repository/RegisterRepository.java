package com.anugraha.aepltest.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anugraha.aepltest.entity.RegisterEntity;

@Repository
public class RegisterRepository {
		
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void savedetails(RegisterEntity registerEntity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(registerEntity);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Object getDataById(String name) {
		try {
			Session session = sessionFactory.openSession();
			String sql="FROM RegisterEntity r WHERE r.email=?1";
			Query query = session.createQuery(sql);
			query.setParameter(1,name);
		
			List list = query.getResultList();
			if(!list.isEmpty()) {
				return list.get(0);
			}
				
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
		}
		return null;
	}
}
