package com.bridgeit.ManyToOne;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Employee")
public class Employee 
{
	private long employeeId;
	private String empployeeName;
	private Address employeeAddress;
	
	public Employee() {
	}

	public Employee(String empployeeName, Address employeeAddress) {
		this.empployeeName = empployeeName;
		this.employeeAddress = employeeAddress;
	}

	@Id
	@GeneratedValue(generator="sequence",strategy=GenerationType.AUTO)
	@GenericGenerator(name="sequence", strategy="native")
	@Column(name = "EMPLOYEE_ID")
	public long getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "STUDENT_NAME", nullable = false, length = 100)
	public String getEmployeeName() {
		return this.empployeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.empployeeName = employeeName;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Add_ID")
	public Address getEmployeeAddress() 
	{
		return this.employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
}
