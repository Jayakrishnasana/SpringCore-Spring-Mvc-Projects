package org.ass.sms;

public class CommonService {
	
	public static String sendSms(String msgContent,String contactNumber) {
		
		return "SMS sent successfully to mobile number : "+contactNumber;
	}
}