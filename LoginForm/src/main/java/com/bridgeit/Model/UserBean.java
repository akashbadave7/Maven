package com.bridgeit.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="registration")
public class UserBean 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="idgen")
	@GenericGenerator(name="idgen", strategy="native")
	private int id;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name,email,password,mobilenumber;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setMobileNumber(String mobilenumber)
	{
		this.mobilenumber= mobilenumber;
	}
	public String getMobileNumber()
	{
		return mobilenumber;
	}
}
