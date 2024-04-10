package org.jayakrishna.project1.controller;

import org.jayakrishna.project1.dto.RegisterDto;
import org.jayakrishna.project1.entity.RegisterEntity;
import org.jayakrishna.project1.serviceImp.RegisterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	
//	@Autowired
//	private RegisterServiceImp registerServiceImp;
	
	@RequestMapping("/saveDetails")
	public ModelAndView saveDetails(RegisterDto registerDto) {
		System.out.println("Hellooooo");
		System.out.println(registerDto);
		
//		registerServiceImp.processUserInfo(registerEntity);
		return new ModelAndView("index.jsp");
		
	}

}
