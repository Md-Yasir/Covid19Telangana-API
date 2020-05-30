package com.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "volunteer")
public class VolEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "phno")
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec
	private long phno;

	@Column(name = "altphno")
	private long altphno;
<<<<<<< HEAD
=======
	private int phno;

	@Column(name = "altphno")
	private int altphno;
>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec

	@Column(name = "fname")
	private String fname;

	@Column(name = "address")
	private String address;
<<<<<<< HEAD
<<<<<<< HEAD
	
	@Column(name = "aadhaar")
	private long aadhaar;
=======
>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98
=======
	
	@Column(name = "aadhaar")
	private long aadhaar;
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec

	@Column(name = "email")
	private String email;

	@Column(name = "qualification")
	private String qualification;

	@Column(name = "age")
	private int age;


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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec
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
<<<<<<< HEAD
=======
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getAltphno() {
		return altphno;
	}
	public void setAltphno(int altphno) {
>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec
		this.altphno = altphno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec
	public long getAadhaar() {
		return aadhaar;
	}
	public void setAadhaar(long aadhaar) {
		this.aadhaar = aadhaar;
	}

	
<<<<<<< HEAD
=======


>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec

}
