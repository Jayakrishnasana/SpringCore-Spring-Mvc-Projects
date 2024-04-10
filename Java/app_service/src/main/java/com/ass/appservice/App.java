package com.ass.appservice;

import com.ass.appservice.applicationentity.ApplicationEntity;
import com.ass.appservice.dto.ApplicationDTO;
import com.ass.appservice.repository.ApplicationRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationEntity applicationEntity = new ApplicationEntity();
        
        applicationEntity.setAltkey(238);
        applicationEntity.setApplicationName("Python Course");
        applicationEntity.setUrl("http://www.python.com");
        applicationEntity.setApplicationType("easy app");
        applicationEntity.setUserName("python");
        applicationEntity.setPassword("python@123");
        
        
        ApplicationRepository repository = new ApplicationRepository();
        repository.saveOrUpdateApplicationDetails(applicationEntity);
       
//        ApplicationEntity applicationEntity2 = repository.getById(238);
//        System.out.println(applicationEntity2);
       
        
       
           
    }
}