package org.jayakrishna.umss.Impl;

import java.util.List;

import org.jayakrishna.umss.entity.RegisterEntity;
import org.jayakrishna.umss.repository.RegisterRepository;
import org.jayakrishna.umss.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class RegisterServiceImpl  implements RegisterService{
	
	@Autowired
	private RegisterRepository registerRepository;
	
	
	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		registerRepository.saveUser(registerEntity);
		
	}


	@Override
	public List<RegisterEntity> getAllUser() {
		return registerRepository.findAllUser();
	}
	
	

}
