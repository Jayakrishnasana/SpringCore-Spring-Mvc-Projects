package org.jayakrishna.project1.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
	
	@Configuration
	public class MysqlConnectionUtil {
		
		@Bean
		public LocalSessionFactoryBean getSessionFactory() {
				
				LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
				sessionFactory.setDataSource(getDataSource());
				sessionFactory.setHibernateProperties(getConnectionProperties());
				sessionFactory.setPackagesToScan("org.jayakrishna.project1.entity");
				return sessionFactory;
			}
		
		@Bean
		public DataSource getDataSource() {
		
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
			dataSource.setUrl("jdbc:mysql://localhost:3306/sree");
			dataSource.setUsername("root");
			dataSource.setPassword("root");
			return dataSource;
	}
	
		public static Properties getConnectionProperties() {
			Properties p = new Properties();
		//	p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			p.setProperty("hibernate.show_sql", "true");
			p.setProperty("hibernate.hbm2dd1.auto","update");
			return p;
		}
	}
