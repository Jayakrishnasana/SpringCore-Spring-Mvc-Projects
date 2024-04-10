package org.jayakrishna.SpringProject1;

import org.jayakrishna.SpringProject1.configuration.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 * 
 *
 */
public class App 
{
   
	public static void main( String[] args )
    {	
//    	CommonUtil commonUtil = new CommonUtil();
//    	RestUtil restUtil = new RestUtil();	
    	
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    	ctx.register(AppConfiguration.class);
    	ctx.refresh();
//    	RestUtil restUtil = ctx.getBean(RestUtil.class);
//    	System.out.println(restUtil);
//    	restUtil.sendData("send data to Java");n
    	
    	
    	
    	CommonUtil commonUtil = ctx.getBean(CommonUtil.class);
    	ctx.getBean(CommonUtil.class);
    	ctx.getBean(CommonUtil.class);
    	ctx.getBean(CommonUtil.class);
    	ctx.getBean(CommonUtil.class);
    	ctx.getBean(CommonUtil.class);
    	ctx.getBean(CommonUtil.class);
    	
    	
    	
    	ctx.getBean(RestUtil.class);
    	ctx.getBean(RestUtil.class);
    	ctx.getBean(RestUtil.class);
    	ctx.getBean(RestUtil.class);
    	ctx.getBean(RestUtil.class);
    	ctx.getBean(RestUtil.class);
    	ctx.getBean(RestUtil.class);
//    	System.out.println(commonUtil);
       
    }
}
