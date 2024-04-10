package org.jayakrishna.bookmyshow.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.jayakrishna.bookmyshow.showentity.ShowEntity;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory=null;
	static {
		Configuration cfg = new Configuration();
		cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
		cfg.addAnnotatedClass(ShowEntity.class);
		sessionFactory = cfg.buildSessionFactory();	
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}


}
