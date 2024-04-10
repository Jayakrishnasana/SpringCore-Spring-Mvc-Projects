package org.jayakrishna.umss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration ;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration 
@ComponentScan("org.jayakrishna.umss")
public class AppConfiguration {
	
	
}
