package org.jayakrishna.SpringProject1.vehiclemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	@Qualifier("bike")
	private Vehicle vehicle;
	
	@Autowired
	MusicPlayer m;
	
	public void gotowork() {
		m.playingMusic(vehicle.travel());
		
	}

	
	

}
