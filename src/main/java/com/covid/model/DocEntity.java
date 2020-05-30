package com.covid.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "doctorappointment")
public class DocEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "phno")
	private long phno;
	
	@Column(name = "altphno")
	private long altphno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "appointmentdatetime", unique = true)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", timezone = "Asia/kolkata")
	@Temporal(TemporalType.TIMESTAMP)
	Date appointmentdatetime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public long getAltphno() {
		return altphno;
	}

	public void setAltphno(long altphno) {
		this.altphno = altphno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getAppointmentdatetime() {
		return appointmentdatetime;
	}

	public void setAppointmentdatetime(Date appointmentdatetime) {
		this.appointmentdatetime = appointmentdatetime;
	}

	
}
