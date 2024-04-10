package org.jayakrishna.HibernateProject;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static SessionFactory sessionFactory;
	static {
		Configuration cfg = new Configuration();
		Properties properties = MysqlConnectionPropertiesUtil.getConnectionProperties();
		cfg.setProperties(properties);
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(BankAccount.class );
		cfg.addAnnotatedClass(Course.class);
		cfg.addAnnotatedClass(Student.class);
		sessionFactory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
