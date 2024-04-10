package org.krishna.Hospitalmanagement;

import java.util.ArrayList;
import java.util.List;

import org.krishna.Hospitalmanagement.entity.Doctor;
import org.krishna.Hospitalmanagement.entity.MedicalHistory;
import org.krishna.Hospitalmanagement.entity.MedicalObservation;
import org.krishna.Hospitalmanagement.entity.Person;
import org.krishna.Hospitalmanagement.repository.HospitalRepository;

public class App {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		Doctor d = new Doctor();
		
		List<Person> plist=new ArrayList<>();
		List<Doctor> dlist=new ArrayList<>();
		p.setName("jay");
		p.setAge(22);
		p.setEmail("jay@gmail.com");
		plist.add(p);
		
		
		d.setName("doctor Krishna");
		d.setEmail("doctor@gmail.com");
		d.setPerson(plist);
		dlist.add(d);
//		p.getDoctors().add(d);
		
		System.out.println(p);
		System.out.println(plist);
		System.out.println(d);
		HospitalRepository repository = new HospitalRepository();
		repository.saveCustomer(p);
//		repository.saveCustomer(d);
//		
//		System.out.println("Success");
		
		
	}

}
