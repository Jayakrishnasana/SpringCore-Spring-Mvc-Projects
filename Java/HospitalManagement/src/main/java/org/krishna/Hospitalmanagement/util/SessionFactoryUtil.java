package org.krishna.Hospitalmanagement.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.krishna.Hospitalmanagement.entity.Doctor;
import org.krishna.Hospitalmanagement.entity.MedicalHistory;
import org.krishna.Hospitalmanagement.entity.MedicalObservation;
import org.krishna.Hospitalmanagement.entity.Person;


public class SessionFactoryUtil {
	private static  SessionFactory sessionFactory;
	static {
		Configuration configuration = new Configuration();
		Properties p = ConnectionUtill.getConnectionProperties();
		configuration.setProperties(p);
		configuration.addAnnotatedClass(Doctor.class);
		configuration.addAnnotatedClass(Person.class);
		configuration.addAnnotatedClass(MedicalHistory.class);
		configuration.addAnnotatedClass(MedicalObservation.class);
		sessionFactory=configuration.buildSessionFactory();
		
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
