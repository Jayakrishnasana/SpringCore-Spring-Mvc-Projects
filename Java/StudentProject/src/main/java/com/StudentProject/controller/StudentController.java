package com.StudentProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.StudentProject.dto.StudentDto;
import com.StudentProject.entity.StudentEntity;
import com.StudentProject.repository.StudentRepository;
import com.StudentProject.serviceimp.StudentServiceImp;

@Controller
public class StudentController {
	
//	@Autowired
//	private StudentRepository studentRepository;
	@Autowired
	private StudentServiceImp studentServiceImp;
	
	@RequestMapping("/saveStudentDetails")
	public ModelAndView saveStudentDetails(StudentEntity studentEntity) {
		System.out.println("Helooo..........");
		System.out.println(studentEntity);
//		studentRepository.saveStudent(studentEntity);
		studentServiceImp.processUserInfo(studentEntity);
		return new ModelAndView("index.jsp");
		
	}
}
