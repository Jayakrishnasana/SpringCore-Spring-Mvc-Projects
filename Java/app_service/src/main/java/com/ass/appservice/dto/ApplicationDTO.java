package com.ass.appservice.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable{
	
	private String userName;
	
	private String password;
	
	private long altkey;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}
}