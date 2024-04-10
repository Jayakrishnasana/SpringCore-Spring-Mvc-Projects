package org.jay.simplehibernate;

import java.util.Properties;

public class ConnectionUtil {
	
	public static Properties getConnectionProperties() {
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/simplehibernate");
		properties.setProperty(  "hibernate.connection.username", "root");
		properties.setProperty(  "hibernate.connection.password", "root");
		properties.setProperty("hibernate.hbm2ddl.auto","create");
		return properties;
		
		
	}
		
}

	
	
	








	
//	Properties p = new Properties();
//	p.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
//	p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/realm_db");
//	p.setProperty(  "hibernate.connection.username", "root");
//	p.setProperty(  "hibernate.connection.password", "root");
//	p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
//	p.setProperty("hibernate.show_sql", "true");
//	p.setProperty("hibernate.hbm2ddl.auto","update");
//	return p;		