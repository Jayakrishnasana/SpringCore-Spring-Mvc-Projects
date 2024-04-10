package com.anugraha.aepltest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.anugraha.aepltest.entity.RegisterEntity;
import com.anugraha.aepltest.service.RegisterServiceImp;

@Controller
public class RegisterController {

	@Autowired
	private RegisterServiceImp registerServiceImp;

	@PostMapping(value = "/user_register")
	public String savedetails(@Valid @ModelAttribute("RegisterEntity") RegisterEntity registerEntity,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("my form has errors....");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "User Registration.jsp";
		}

		String res = (String) registerServiceImp.savedetails(registerEntity);
		if (res.equals("saved")) {
			System.out.println(registerEntity);

			return ("index.jsp");
		} else {
			return "invalidpage.jsp";
		}
	}

}
