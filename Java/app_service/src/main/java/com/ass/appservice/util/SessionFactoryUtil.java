package com.ass.appservice.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ass.appservice.applicationentity.ApplicationEntity;


public class SessionFactoryUtil {
	private static SessionFactory sessionFactory=null;
	
	static{
		Configuration cfg = new Configuration();
		cfg.setProperties(MysqlConnectionPropertiesUtil.getConnectionProperties());
		cfg.addAnnotatedClass(ApplicationEntity.class);
		sessionFactory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
