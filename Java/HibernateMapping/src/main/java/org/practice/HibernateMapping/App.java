package org.practice.HibernateMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.practice.HibernateMapping.entity.Book;
import org.practice.HibernateMapping.entity.Student;
import org.practice.HibernateMapping.repository.MysqlConnectionUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student s = new Student();
        s.setName("jay");
        
        
        Book b = new Book();
        b.setName("Mahabharath");
        s.setBook(b);
        Book b1 = new Book();
        s.setBook(b1);
       
        List<Student> slist=new ArrayList<>();
        slist.add(s);
        
        
        Configuration configuration = new Configuration();
        Properties properties = MysqlConnectionUtil.sqlConnectionUtil();
        configuration.setProperties(properties);
        configuration.addAnnotatedClass(Student.class).addAnnotatedClass(Book.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(s);
        session.save(b);
        session.save(slist);
        System.out.println(s);
        System.out.println(b);
        transaction.commit();
    }
}
