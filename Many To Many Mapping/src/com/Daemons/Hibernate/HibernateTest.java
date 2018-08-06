package com.Daemons.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Daemons.dto.UserDetails;
import com.Daemons.dto.Vehicle;


public class HibernateTest {

    public static void main(String[] args) {
	
	UserDetails user = new UserDetails();
	user.setUserId(8912);
	user.setUserName("Manoj Sharma");
	
	Vehicle vehicle = new Vehicle();
	vehicle.setVehicleName("Aston Martin");
	
	Vehicle vehicle2 = new Vehicle();
	vehicle2.setVehicleName("Buggati");
	
	user.getVehicle().add(vehicle);
	user.getVehicle().add(vehicle2);
	
	vehicle.getUserlist().add(user);
	vehicle2.getUserlist().add(user);
	/*
	Address homeAddress = new Address();
	homeAddress.setCity("Jaipur");
	homeAddress.setPincode(302033);
	homeAddress.setState("Rajasthan");
	homeAddress.setStreet("Pratap Nagar");
	
	
	Address officeAddress = new Address();
	officeAddress.setCity("Kota");
	officeAddress.setPincode(302080);
	officeAddress.setState("Rajasthan");
	officeAddress.setStreet("Borkheda");
	*/
	
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.save(vehicle);
	session.save(vehicle2);
	session.getTransaction().commit();
	session.close();
	
	System.out.println("First Transaction Completed");
	
	
	sessionFactory.close();
	
    }

}
