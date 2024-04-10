package org.krishna.Hospitalmanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class MedicalHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="patient_name")
	private String patientName;
	
	@OneToOne
	private Person person;
	
	@OneToMany
	private List<MedicalObservation> observation;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<MedicalObservation> getObservation() {
		return observation;
	}
	public void setObservation(List<MedicalObservation> observation) {
		this.observation = observation;
	}
	@Override
	public String toString() {
		return "MedicalHistory [id=" + id + ", patientName=" + patientName + ", person=" + person + ", observation="
				+ observation + "]";
	}
	
	
	
	
	
}
