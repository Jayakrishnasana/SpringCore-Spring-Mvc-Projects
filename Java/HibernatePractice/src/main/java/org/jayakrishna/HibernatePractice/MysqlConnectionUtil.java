package org.jayakrishna.HibernatePractice;

import java.util.Properties;

public class MysqlConnectionUtil {
	
	public static Properties getConnection() {
		
		Properties p = new Properties();
		p.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/newuser");
		p.setProperty(  "hibernate.connection.username", "root");
		p.setProperty(  "hibernate.connection.password", "root");
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto","update");
		return p;		
		
		
	}

}
