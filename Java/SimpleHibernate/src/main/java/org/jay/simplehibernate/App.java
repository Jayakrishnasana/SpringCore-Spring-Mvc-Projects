package org.jay.simplehibernate;

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
        System.out.println( "Hello World!" );
        
        Student student = new Student();
        
        student.setId(1);
        student.setName("ram");
        student.setEmail("ram@gmail.com");
        
        Configuration configuration = new Configuration();
        Properties cp = ConnectionUtil.getConnectionProperties();
        configuration.setProperties(cp);
        configuration.addAnnotatedClass(Student.class);
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        System.out.println(student);
           System.out.println("Successful");
    }
}
