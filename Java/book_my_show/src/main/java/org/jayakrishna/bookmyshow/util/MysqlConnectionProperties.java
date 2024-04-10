package org.jayakrishna.bookmyshow.util;

import java.util.Properties;

public class MysqlConnectionProperties {
	public static Properties getConnectionProperties() {
		
		Properties properties = new Properties();
		
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/bookmyshow");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "root");
		
		
//		properties.setProperty("hibernate.show_sql", "true");
//		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		return properties;
		
	}
}
