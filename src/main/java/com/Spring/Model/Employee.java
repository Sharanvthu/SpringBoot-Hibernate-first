package com.Spring.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "employee")

public class Employee 
{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	@Column
	private String eName;
	@Column
	private String eRole;
	@Column
	private String elang;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteRole() {
		return eRole;
	}
	public void seteRole(String eRole) {
		this.eRole = eRole;
	}
	public String getElang() {
		return elang;
	}
	public void setElang(String elang) {
		this.elang = elang;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eRole=" + eRole + ", elang=" + elang + "]";
	}



}
