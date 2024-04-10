package org.jayakrishna.SpringProject1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("singleton")
@Component
public class RestUtil {
	
	@Value("https://localhost:8081/SpringProject1")
	private String url;
	
	@Value("userName")
	private String requestBody;
	
	@Value("success")
	private String responseBody;
	
	public String getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}
	public String getResponseBody() {
		return responseBody;
	}
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
	
	public String getUrl() {
		return url;
	}
	public  RestUtil() {
		System.out.println(this.getClass().getSimpleName()+" class object created");
		
	}
	public void sendData(String msg) {
		System.out.println("Data sent successfully : "+msg);
	}
	
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "RestUtil [url=" + url + ", requestBody=" + requestBody + ", responseBody=" + responseBody + "]";
	}
	
	

}
