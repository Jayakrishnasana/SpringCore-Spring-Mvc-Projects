package springmvc.controller;

import java.text.Annotation;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyFrontController implements WebApplicationInitializer{

	@SuppressWarnings("resource")
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfigurartion.class);
		DispatcherServlet d = new DispatcherServlet(ctx);
		Dynamic dynamic = servletContext.addServlet(" dispatcherServlet", d);
		dynamic.addMapping("/");
		
		
		
	}
	
	

}
