package com.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "pass")
public class PassEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "fname")
	private String fname;
	
	@Column(name = "phno")
	private long phno;
	
	@Column(name = "altphno")
	private long altphno;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "passrequirment")
	private String passrequirment;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "vhno")
	private String vhno;
	
	@Column(name = "start")
	private String start;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "route")
	private String route;

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

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassrequirment() {
		return passrequirment;
	}

	public void setPassrequirment(String passrequirment) {
		this.passrequirment = passrequirment;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getVhno() {
		return vhno;
	}

	public void setVhno(String vhno) {
		this.vhno = vhno;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}
	
	
}
