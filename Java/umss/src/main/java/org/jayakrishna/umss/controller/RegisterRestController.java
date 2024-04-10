package org.jayakrishna.umss.controller;

import java.util.List;

import org.jayakrishna.umss.Impl.RegisterServiceImpl;
import org.jayakrishna.umss.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class RegisterRestController {
	
	@Autowired
	private RegisterServiceImpl registerServiceImpl;
	
//	@RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
	@GetMapping(value = "/getAllUser")
	public @ResponseBody List<RegisterEntity> allUserDetails() {
//		System.out.println("get()");
//		System.out.println(registerServiceImpl.getAllUser());
		return registerServiceImpl.getAllUser();
	}
	
	
	
	
//	@RequestMapping(value="/saveRegisterDetails" ,method = RequestMethod.POST)
	@PostMapping(value="/saveRegisterDetails")
	public void saveUserDetails( @RequestBody RegisterEntity registerEntity) {
		registerServiceImpl.processUserInfo(registerEntity);
	}

}
