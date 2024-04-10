package com.StudentProject.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentProject.entity.StudentEntity;
import com.StudentProject.repository.StudentRepository;
import com.StudentProject.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void processUserInfo(StudentEntity studentEntity) {
		studentRepository.saveStudent(studentEntity);
		
	}

}
