package com.Daemons.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Daemons.AddressDTO.Address;
import com.Daemons.AddressDTO.AddressData;
import com.Daemons.dto.Academic;
import com.Daemons.dto.Employee;


public class Main {

    public static void main(String[] args) {
	
	Employee user = new Employee();
	user.setUserName("Manoj Sharma");
	
	Address address = new Address();

	AddressData homeAddress = new AddressData();
	AddressData officeAddress = new AddressData();
	
	homeAddress.setCity("Jaipur");
	homeAddress.setPincode(302033);
	homeAddress.setState("Rajasthan");
	homeAddress.setStreet("Pratap Nagar");
	
	officeAddress.setCity("Kota");
	officeAddress.setPincode(302080);
	officeAddress.setState("Rajasthan");
	officeAddress.setStreet("Borkheda");
	
	address.setHomeAddress(homeAddress);
	address.setOfficeAddress(officeAddress);
	
	Academic empAcademic = new Academic();
	empAcademic.setBranch("CSE");
	empAcademic.setCollege("CSE");
	empAcademic.setDegree("B.Tech");
	
	
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(user);
	session.save(address);
	session.save(empAcademic);
	session.getTransaction().commit();
	session.close();
	
	user=null;
	session = sessionFactory.openSession();
	session.beginTransaction();
	user = (Employee) session.get(Employee.class, 1);
	sessionFactory.close();
	System.out.println(user.getUserName());
	
    }

}
