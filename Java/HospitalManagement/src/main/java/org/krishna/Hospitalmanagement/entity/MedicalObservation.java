package org.krishna.Hospitalmanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="medical_observation")
public class MedicalObservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String encounter;
	@OneToMany
	private List<Doctor> doctors;
	
	@OneToOne
	private MedicalHistory history;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEncounter() {
		return encounter;
	}
	public void setEncounter(String encounter) {
		this.encounter = encounter;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	public MedicalHistory getHistory() {
		return history;
	}
	public void setHistory(MedicalHistory history) {
		this.history = history;
	}
	@Override
	public String toString() {
		return "MedicalObservation [id=" + id + ", encounter=" + encounter + ", doctors=" + doctors + ", history="
				+ history + "]";
	}
	
	
	
	
}
