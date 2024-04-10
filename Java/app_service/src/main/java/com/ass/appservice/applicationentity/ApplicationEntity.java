package com.ass.appservice.applicationentity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="application_info")
public class ApplicationEntity implements Serializable{
	
	@Id
	@Column(name="alt_key")
	private long altkey;
	
	@Column(name="app_name")
	private String applicationName;
	
	@Column(name="url")
	private String url;
	
	@Column(name="app_type")
	private String applicationType;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

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

	@Override
	public String toString() {
		return "ApplicationEntity [altkey=" + altkey + ", applicationName=" + applicationName + ", url=" + url
				+ ", applicationType=" + applicationType + ", userName=" + userName + ", password=" + password + "]";
	}
	
	

}
