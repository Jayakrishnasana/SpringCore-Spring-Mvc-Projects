package com.ass.appservice.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ass.appservice.applicationentity.ApplicationEntity;
import com.ass.appservice.dto.ApplicationDTO;
import com.ass.appservice.util.MysqlConnectionPropertiesUtil;
import com.ass.appservice.util.SessionFactoryUtil;

public class ApplicationRepository {
	
	public void saveOrUpdateApplicationDetails(ApplicationEntity applicationEntity) {
//		Configuration cfg = new Configuration();
//		cfg.setProperties(MysqlConnectionPropertiesUtil.getConnectionProperties());
//		cfg.addAnnotatedClass(ApplicationEntity.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(applicationEntity);
		transaction.commit();
		
		
	}
	
	public ApplicationEntity getById(long id) {
//		Configuration cfg = new Configuration();
//		cfg.setProperties(MysqlConnectionPropertiesUtil.getConnectionProperties());
//		cfg.addAnnotatedClass(ApplicationEntity.class);
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(ApplicationEntity.class, id);
		
	}
	
	public void update(ApplicationDTO applicationDTO) {
		
		ApplicationEntity applicationEntity = getById(applicationDTO.getAltkey());
		if(applicationEntity !=null) {
		applicationEntity.setUserName(applicationDTO.getUserName());
		applicationEntity.setPassword(applicationDTO.getPassword());
		saveOrUpdateApplicationDetails(applicationEntity);
		
		}
		
	}

}
