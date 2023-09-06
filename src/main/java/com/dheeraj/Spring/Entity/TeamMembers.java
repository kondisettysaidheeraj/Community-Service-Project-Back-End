package com.dheeraj.Spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TeamMembers")
public class TeamMembers {

	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	@Column(name="Name")
	 private String name;
	@Column(name="Role")
	 private String role;
	@Column(name="Contract_Number")
	 private String contractNumber;
	@Column(name="Email")
	 private String email;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
}





