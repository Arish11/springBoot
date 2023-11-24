package com.example.springDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long depId;
	@NotBlank(message = "Please enter a department name")
	private String depName;
	private String depAddr;
	private String depCode;
	
	public Department() {
	}

	public Long getDepId() {
		return depId;
	}

	public void setDepId(Long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepAddr() {
		return depAddr;
	}

	public void setDepAddr(String depAddr) {
		this.depAddr = depAddr;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public Department(Long depId, String depName, String depAddr, String depCode) {
		this.depId = depId;
		this.depName = depName;
		this.depAddr = depAddr;
		this.depCode = depCode;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depAddr=" + depAddr + ", depCode=" + depCode
				+ "]";
	}

}
