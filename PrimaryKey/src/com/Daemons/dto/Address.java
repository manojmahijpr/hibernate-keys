package com.Daemons.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String city;
    private String State;
    private int pincode;

    public String getStreet() {
	return street;
    }

    public void setStreet(String street) {
	this.street = street;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getState() {
	return State;
    }

    public void setState(String state) {
	State = state;
    }

    public int getPincode() {
	return pincode;
    }

    public void setPincode(int pincode) {
	this.pincode = pincode;
    }

}
