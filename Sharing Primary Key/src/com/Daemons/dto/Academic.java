package com.Daemons.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_ACADEMIC")
public class Academic {

    private String degree;
    private String branch;
    private String college;

    public String getDegree() {
	return degree;
    }

    public void setDegree(String degree) {
	this.degree = degree;
    }

    public String getBranch() {
	return branch;
    }

    public void setBranch(String branch) {
	this.branch = branch;
    }

    public String getCollege() {
	return college;
    }

    public void setCollege(String college) {
	this.college = college;
    }
}
