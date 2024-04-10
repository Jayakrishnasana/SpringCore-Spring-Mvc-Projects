package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.entity.EntityClass;
import springmvc.entity.RepositoryClass;

@Controller
public class ControllerClass {
	@Autowired
	private RepositoryClass rc;
	
//	@RequestMapping("/add")
//	public String add() {
//		System.out.println("Hi Im here");
//		return "NewFile.jsp";
//	}
	
	@RequestMapping("/savedetails")
	public ModelAndView savedetails(EntityClass en) {
		System.out.println(en);
		rc.save(en);
		return new ModelAndView("NewFile.jsp");
	}

}
