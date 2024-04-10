package practicesimplemvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import practicesimplemvc.entity.Student;
import practicesimplemvc.repository.StudentRepository;
import practicesimplemvc.service.StudentService;
import practicesimplemvc.entity.Student;

@Controller
public class ControllerClass {
	@RequestMapping("/hello")
	public String details() {
		System.out.println("Hi how are you");
		System.out.println("Namsteeee");
		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("NewFile.jsp");
		
		return "NewFile.jsp";
		
	}
	
	@Autowired
	private StudentService stser;
	@RequestMapping("/save")
	public ModelAndView save(Student stu) {
		stser.savedetailsinservice(stu);
		System.out.println(stu);
		return new ModelAndView("NewFile.jsp");
	}

}
