package org.krishna.Hospitalmanagement.util;

import java.util.Properties;

public class ConnectionUtill {
	public static Properties getConnectionProperties() {
		Properties p = new Properties();
		p.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hospitalmanagement");
		p.setProperty(  "hibernate.connection.username", "root");
		p.setProperty(  "hibernate.connection.password", "root");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		return p;		
	}

}
