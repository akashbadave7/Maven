package com.bridgeit.ManyToOne;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	Configuration config = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction(); 
		
		/*Address address = new Address("OMR Road", "Chennai", "TN", "600097");
		
		Employee student1 = new Employee("Akash", address);
		Employee student2 = new Employee("Sujit", address);
		session.save(student1);
		session.save(student2);
		System.out.println("Success");
		transaction.commit();*/
		
		Query query= session.createQuery("from Employee");
		List<Employee> list = query.list();
		for(Employee emp: list)
		{
			String address = emp.getEmployeeAddress().toString();
			System.out.println(emp.getEmployeeId()+" "+emp.getEmployeeName()+" "+address);
		}
 		transaction.commit();
    }
}