package org.jayakrishna.project1.serviceImp;

import org.jayakrishna.project1.entity.RegisterEntity;
import org.jayakrishna.project1.repository.RegisterRepository;
import org.jayakrishna.project1.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


@Service
public class RegisterServiceImp implements RegisterService {
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		registerRepository.saveUser(registerEntity);

	}

}
