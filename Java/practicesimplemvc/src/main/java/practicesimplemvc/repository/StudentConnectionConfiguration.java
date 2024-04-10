package practicesimplemvc.repository;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class StudentConnectionConfiguration {
	
	
	@Bean
	public LocalSessionFactoryBean  getSessionFactory() {
		LocalSessionFactoryBean b=new LocalSessionFactoryBean();
		b.setDataSource(setData());
		b.setHibernateProperties(setProperties());
		b.setPackagesToScan("practicesimplemvc.entity");
		return b;
	}
	
	
	public DriverManagerDataSource setData() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/springmvc");
		source.setUsername("root");
		source.setPassword("root");
		return source;
		
	}
	public Properties setProperties() {
		
			Properties p = new Properties();
			p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			p.setProperty("hibernate.show_sql", "true");
			p.setProperty("hibernate.hbm2ddl.auto", "update");
			return p;
		
	}
	
	
//	@Bean
//	public EntityManagerFactory getConnection() {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jay");
//		
//		return factory;
//	}

}
