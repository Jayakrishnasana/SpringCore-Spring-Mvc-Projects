package com.anugraha.aepltest.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "aepl_db3	")
public class RegisterEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;

	@Pattern(regexp = "^[a-zA-Z ]+")
	@NotBlank(message = "is required")
	private String name;

	@Pattern(regexp = "[a-zA-z][a-zA-z0-9]*@[a-zA-z0-9]+[.]com")
	@NotBlank
	@Column(nullable = false, unique = true)
	private String email;

	@Pattern(regexp = "[6789][0-9]{9}")
	@NotBlank
	@Column(nullable = false, unique = true)
	private String phoneNumber;

	@NotBlank
	private String dateOfBirth;

	@NotBlank
	private String location;

	@Lob
	private byte[] document;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public byte[] getDocument() {
		return document;
	}
	
	public void setDocument(byte[] document) {
		this.document = document;
	}

	@Override
	public String toString() {
		return "RegisterEntity [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", dateOfBirth=" + dateOfBirth + ", location=" + location + ", document=" + Arrays.toString(document)
				+ "]";
	}

}
