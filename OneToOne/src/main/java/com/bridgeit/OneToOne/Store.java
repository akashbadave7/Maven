package com.bridgeit.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {

	public static void main(String[] args) throws SecurityException
	{
		Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	    SessionFactory sf=cfg.buildSessionFactory();  
	    Session session=sf.openSession();  
	    Transaction transaction= session.beginTransaction();
	     
	    StudentAddress address2 = new StudentAddress("Ring Road", "Banglore", "Karnataka", "560000");
		Student student2 = new Student("Akash", address2);
		session.save(student2);
		transaction.commit();
	    System.out.println("success");  

	}

}
