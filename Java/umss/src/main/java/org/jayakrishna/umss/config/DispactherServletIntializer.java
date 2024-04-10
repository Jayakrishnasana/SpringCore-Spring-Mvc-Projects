package org.jayakrishna.umss.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispactherServletIntializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(ctx);
		Dynamic dynamic = servletContext.addServlet(" dispatcherServlet", dispatcherServlet);
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);
		
	}

}
