package com.bridgeit.OneToMany;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SingleLevelCache {

	public static void main(String[] args) 
	{
		Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//fetch the student entity from database first time
		Student student = session.load(Student.class, new Long(2));

		System.out.print(student.getStudentName()+" ");
		Set<Phone> number = student.getStudentPhoneNumber();
		for(Phone num:number)
		{
			System.out.print(num.getPhoneNumber()+" ");
		}
		System.out.println();
		//fetch the student entity  again
		
		student = session.load(Student.class, new Long(2));
		
		System.out.println(student.getStudentName());
		
		transaction.commit();
		
	}

}
