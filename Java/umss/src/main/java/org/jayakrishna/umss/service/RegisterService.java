package org.jayakrishna.umss.service;

import java.util.List;

import org.jayakrishna.umss.entity.RegisterEntity;

public interface RegisterService {
	
	public void processUserInfo(RegisterEntity registerEntity);
	
	public List<RegisterEntity> getAllUser();

}
