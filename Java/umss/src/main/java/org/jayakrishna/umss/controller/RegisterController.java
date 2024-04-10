package org.jayakrishna.umss.controller;

import org.jayakrishna.umss.Impl.RegisterServiceImpl;
import org.jayakrishna.umss.dto.RegisterDto;
import org.jayakrishna.umss.entity.RegisterEntity;
import org.jayakrishna.umss.repository.RegisterRepository;
import org.jayakrishna.umss.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Component
@Controller
public class RegisterController {
	
	@Autowired
	private RegisterServiceImpl registerServiceImpl;

	
	@RequestMapping(value = "/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterEntity registerEntity) {
		System.out.println(registerEntity);
		registerServiceImpl.processUserInfo(registerEntity);
		return new ModelAndView("index.jsp");
	}

}
