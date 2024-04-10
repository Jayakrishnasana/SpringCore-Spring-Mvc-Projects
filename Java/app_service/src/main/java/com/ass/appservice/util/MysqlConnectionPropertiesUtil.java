package com.ass.appservice.util;

import java.util.Properties;

public class MysqlConnectionPropertiesUtil {
	public static Properties getConnectionProperties() {
		
		Properties properties = new Properties();
		
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/realm_db");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		
		
//		properties.setProperty("hibernate.show_sql", "true");
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		return properties;
		
	}
}

