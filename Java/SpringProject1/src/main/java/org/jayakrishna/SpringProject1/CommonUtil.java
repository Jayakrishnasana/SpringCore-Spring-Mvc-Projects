package org.jayakrishna.SpringProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class CommonUtil {
	
	@Autowired
	private RestUtil restUtil;

	

	
	public RestUtil getRestUtil() {
		return restUtil;
	}

	public void setRestUtil(RestUtil restUtil) {
		this.restUtil = restUtil;
	}

	@Override
	public String toString() {
		return "CommonUtil [restUtil=" + restUtil + "]";
	}
	
	public  CommonUtil() {
		System.out.println(this.getClass().getSimpleName()+" class object created");
		
	}
	

	
	
	
}
