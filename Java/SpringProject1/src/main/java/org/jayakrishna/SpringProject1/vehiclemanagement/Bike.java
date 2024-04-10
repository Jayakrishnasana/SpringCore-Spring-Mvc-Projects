package org.jayakrishna.SpringProject1.vehiclemanagement;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bike")
public class Bike implements Vehicle{

	@Override
	public String travel() {
		return "No song "+getClass().getSimpleName();
		
	}

}
