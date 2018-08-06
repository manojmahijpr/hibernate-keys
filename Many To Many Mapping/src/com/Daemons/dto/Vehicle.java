package com.Daemons.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private int vehicleId;
    private String vehicleName;

    @ManyToMany(mappedBy = "vehicle")
    private Collection<UserDetails> userlist = new ArrayList<UserDetails>();

    public Collection<UserDetails> getUserlist() {
        return userlist;
    }

    public void setUserlist(Collection<UserDetails> userlist) {
        this.userlist = userlist;
    }

    public int getVehicleId() {
	return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
	return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
	this.vehicleName = vehicleName;
    }


}
