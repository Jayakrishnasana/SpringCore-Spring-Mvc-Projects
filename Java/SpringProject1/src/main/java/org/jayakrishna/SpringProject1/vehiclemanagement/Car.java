package org.jayakrishna.SpringProject1.vehiclemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("car")
public class Car implements Vehicle {
	

	@Override
	public String travel() {
		return "song "+getClass().getSimpleName();
	}

}
