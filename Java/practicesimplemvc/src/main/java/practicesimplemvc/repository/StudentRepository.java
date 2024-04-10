package practicesimplemvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import practicesimplemvc.entity.Student;

@Repository
public class StudentRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void savedetails(Student s) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(s);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
//	@Autowired
//	private StudentConnectionConfiguration sc;
//	public void saveDetails(Student s) {}
//		sc.get
}
