package com.bridgeit.OneToMany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Phone 
{
	
	private long phoneID;
	private String phonetype;
	private String phoneNumber;
	
	public Phone(){
	}
	public Phone(String phonetype,String phoneNumber)
	{
		this.phonetype=	phonetype;
		this.phoneNumber = phoneNumber;
	}
	@Id
	@GeneratedValue(generator ="sequence", strategy=GenerationType.AUTO)
	@GenericGenerator(name="sequence", strategy="native")
	@Column(name="PHONE_ID")
	public long getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(long phoneID) {
		this.phoneID = phoneID;
	}
	
	@Column(name="PHONE_TYPE",nullable=false,length=10)
	public String getPhonetype() {
		return phonetype;
	}
	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}
	
	@Column(name="PHONE_NUMBER",nullable=false,length=15)
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
