package com.anugraha.aepltest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anugraha.aepltest.entity.RegisterEntity;
import com.anugraha.aepltest.repository.RegisterRepository;
@Service
public class RegisterServiceImp implements RegisterService {
	
	@Autowired
	private RegisterRepository registerRepository;
	@Override
	public Object savedetails(RegisterEntity registerEntity) {
		Object object = registerRepository.getDataById(registerEntity.getEmail());
		System.out.println(object);
		if(object==null) {
		registerRepository.savedetails(registerEntity);
		return "saved";
		
		}
		else {
			return null;
		}
		

	}

}
