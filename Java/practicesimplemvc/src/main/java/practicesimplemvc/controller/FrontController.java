package practicesimplemvc.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class FrontController implements WebApplicationInitializer {

	@SuppressWarnings("resource")
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(AppConfiguration.class);
		
		DispatcherServlet ds = new DispatcherServlet(ctx);
		Dynamic addServlet = servletContext.addServlet("dispacher", ds);
		addServlet.addMapping("/");
		
	}

}
