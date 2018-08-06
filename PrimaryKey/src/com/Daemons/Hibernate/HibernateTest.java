package com.Daemons.Hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Daemons.dto.Address;
import com.Daemons.dto.UserDetails;

public class HibernateTest {

    public static void main(String[] args) {
	
	UserDetails user = new UserDetails();
	user.setUserName("Manoj Sharma");
	user.setJoinedDate(new Date());
	user.setDescription("CEO Google");
	
	Address address = new Address();
	address.setCity("Jaipur");
	address.setPincode(302033);
	address.setState("Rajasthan");
	address.setStreet("Raghunathpuri");
	
	user.setAddress(address);
	
	
	
	UserDetails user2 = new UserDetails();
	user2.setUserName("Jyoti Soni");
	
	user2.setJoinedDate(new Date());
	user2.setDescription("IAS Officer");
	
	Address address2 = new Address();
	address2.setCity("Surat");
	address2.setPincode(532467);
	address2.setState("Gujrat");
	address2.setStreet("Gandh Nagar");
	
	user2.setAddress(address2);
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.save(user2);
	session.getTransaction().commit();
	session.close();
	
	
	session = sessionFactory.openSession();
	session.beginTransaction();
	UserDetails user3 = (UserDetails) session.get(UserDetails.class, user2.getUserId());
	System.out.println(user3.getUserName());
	user2 = (UserDetails) session.get(UserDetails.class, user.getUserId());
	System.out.println(user2.getUserName());
	sessionFactory.close();
	
    }

}
