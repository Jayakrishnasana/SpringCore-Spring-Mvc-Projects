package com.ass.krishna;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Alian an = new Alian();
//        an.setAid(102);
//       an.setAname("Krish");
//       an.setColor("Blue");
    	
    	Laptop lap = new Laptop();
    	lap.setId(101);
    	lap.setName("HP");
    	
    	
    	Student stu = new Student();
    	
    	stu.setRollno(1);
    	stu.setName("Krish");
    	stu.setMarks(97);
    	stu.getLaptop().add(lap);
    	lap.getStudent().add(stu);
    	
    	
    	
    	
       
       Configuration cfg = new Configuration();
      Properties properties = MysqlConnectionPropertiesUtil.getConnectionProperties();
      cfg.setProperties(properties);
      cfg.addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
       SessionFactory sessionFactory = cfg.buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.beginTransaction();
       session.save(lap);
       session.save(stu);
       transaction.commit();
       
       
        
    }
}
