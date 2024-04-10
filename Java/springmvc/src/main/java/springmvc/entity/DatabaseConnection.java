package springmvc.entity;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class DatabaseConnection {
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean b=new LocalSessionFactoryBean();
		b.setDataSource(getData());
		b.setHibernateProperties(getConnectionProperties());
		b.setPackagesToScan("springmvc.entity");
		return b;
	}
	
	
	public Properties getConnectionProperties() {
		Properties p = new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
	}
	
	public DriverManagerDataSource getData() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/springmvc");
		source.setUsername("root");
		source.setPassword("root");
		return source;
		
	}

}
