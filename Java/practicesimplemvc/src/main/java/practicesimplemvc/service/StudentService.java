package practicesimplemvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import practicesimplemvc.entity.Student;
import practicesimplemvc.repository.StudentRepository;

public class StudentService {
	@Autowired
	private StudentRepository sr;
	
	public void savedetailsinservice(Student s) {
		sr.savedetails(s);
	}

}
