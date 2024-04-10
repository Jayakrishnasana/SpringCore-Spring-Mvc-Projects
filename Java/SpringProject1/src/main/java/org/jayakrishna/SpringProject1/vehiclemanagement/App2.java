package org.jayakrishna.SpringProject1.vehiclemanagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
    	Person p = ctx.getBean(Person.class);
    	p.gotowork();
	}
	
}