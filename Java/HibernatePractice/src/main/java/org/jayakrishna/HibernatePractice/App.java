package org.jayakrishna.HibernatePractice;

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
//        System.out.println( "Hello World!" );
//        StudentName name = new StudentName();
//        name.setfName("Jaya");
//        name.setmName("Krishna");
//        name.setlName("Sana");
//        Student s = new Student();
//        s.setId(1);
//        s.setName(name);
//        s.setEmail("jay@gmail.com");
//        s.setNumber(56789);
    	
    	Laptop lap = new Laptop();
    	lap.setLid(101);
    	lap.setLname("Dell");
    	
    	
    	Student1 s = new Student1();
    	s.setRollNo(1);
    	s.setName("Madhu"); 
    	s.setMarks(75);
    	s.getLaptop().add(lap); 
    	lap.getStudent1().add(s);
    
        
        Configuration configuration = new Configuration();
        Properties properties = MysqlConnectionUtil.getConnection();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Student1.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(s);// save the details
        session.save(lap); 
        transaction.commit();
        
//        s = session.get(Student.class, 1);//get the details 
//        System.out.println(s);
        
        
    }
}
