package com.Daemons.dto;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import com.Daemons.AddressDTO.Address;


@Entity
@Table(name = "EMP_RECORD")
public class Employee {

    @Id
    @GeneratedValue
    private int userId;
    @Column(name = "User_Name")
    private String userName;
    
    @JoinTable(name="USER_ADDRESS" , joinColumns = @JoinColumn(name = "USER_ID"))
    private Address address;
    
    @JoinTable(name="USER_Academic" , joinColumns = @JoinColumn(name = "USER_ID"))
    private Academic academic;
    
    
    public int getUserId() {
	return userId;
    }

    public void setUserId(int userId) {
	this.userId = userId;
    }

    public String getUserName() {
	return userName;
    }

    public void setUserName(String userName) {
	this.userName = userName;
    }

}
