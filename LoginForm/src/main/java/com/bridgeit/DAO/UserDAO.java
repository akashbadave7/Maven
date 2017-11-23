package com.bridgeit.DAO;



import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bridgeit.Model.UserBean;



public class UserDAO 
{
/*	final String JDBC_Driver = "com.mysql.jdbc.Driver";
	final String DB_Url = "jdbc:mysql://localhost:3306/akash";
	
	//Database credential
	final String username = "root";
	final String password = "root";
	Connection connection=null;
	ResultSet resultSet=null;*/
	
	
    private Session session=null;
    
    private Configuration configure=new Configuration().configure("hibernate.cfg.xml");  
    
      
    //creating seession factory object  
   private SessionFactory sessionFactory=configure.buildSessionFactory();  
    
	public UserBean getEmail(String email,String password)
	{
		UserBean user=null;
		try {
				session=sessionFactory.openSession();
				Query query = session.createQuery("from UserBean where email=:email and password=:password");
				query.setParameter("email", email);
				query.setParameter("password", password);
				
				List<UserBean> list = query.list();
			
			if (list.isEmpty()) 
			{ 
				System.out.println("Sorry, you are not a registered user.. Please sign up first"); 
			} //if user exists set the isValid variable to true 
			else 
			{ 
				user =list.get(0);
				/*for (int i = 0; i < list.size(); i++) 
			    {
					UserBean details = (UserBean) list.get(i);
					String name = details.getName();
					String mobile = details.getMobileNumber();
					UserBean.setName(name); 
					UserBean.setMobileNumber(mobile);
			    }*/
			} 
	
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	}
	public int insertUser(UserBean userDetials)
	{
		/*PreparedStatement prepareStatement = null;*/
		int i = 0;
		try
		{
			 session=sessionFactory.openSession();
			 Transaction transaction=session.beginTransaction();
			// reading data from signup.jsp page
			String email="";
			String mobile ="";
			Query query = session.createQuery("from UserBean where email='"+userDetials.getEmail()+"' or mobilenumber='"+userDetials.getMobileNumber()+"'");
			List list = query.list();
			
			/*while (rs.next())*/
			if(!list.isEmpty())
			{
				UserBean details = (UserBean) list.get(0);
				email = details.getEmail();
				mobile = details.getMobileNumber();
			}
			if(!(email.equals(userDetials.getEmail()) || mobile.equals(userDetials.getMobileNumber())))
			{
				
				i=(int) session.save(userDetials);//persisting the object  
			      
			    transaction.commit();//transaction is committed  
			/*	prepareStatement.setString(1, user.getName());
				prepareStatement.setString(2, user.getEmail());
				prepareStatement.setString(3, user.getPassword());
				prepareStatement.setString(4, user.getMobile());
				prepareStatement.executeUpdate();*/
			}
			//setting values to attribute
			
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		
		return i;
	}
}
