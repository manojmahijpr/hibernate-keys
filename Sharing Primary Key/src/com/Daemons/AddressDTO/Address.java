package com.Daemons.AddressDTO;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.Daemons.dto.EmpId;

@Entity
@Table(name = "EMP_ADDRESS")
public class Address {

    
    @Embedded
    @AttributeOverrides({ 
	@AttributeOverride(name = "street", column = @Column(name = "HOME_STREET")),
	@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY")),
	@AttributeOverride(name = "state", column = @Column(name = "HOME_STATE")),
	@AttributeOverride(name = "pincode", column = @Column(name = "HOME_PINCODE")) })
    private AddressData homeAddress;

    @Embedded
    @AttributeOverrides({ 
	@AttributeOverride(name = "street", column = @Column(name = "OFFICE_STREET")),
	@AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY")),
	@AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE")),
	@AttributeOverride(name = "pincode", column = @Column(name = "OFFICE_PINCODE")) })
    private AddressData officeAddress;

    public AddressData getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(AddressData homeAddress) {
        this.homeAddress = homeAddress;
    }

    public AddressData getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(AddressData officeAddress) {
        this.officeAddress = officeAddress;
    }


}
