package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("121")
	private int stud_id;
	@Value("Om")
	private String name;
	@Value("10th")
	private String stud_class;

	@Autowired
	private Country con;

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStud_class() {
		return stud_class;
	}

	public void setStud_class(String stud_class) {
		this.stud_class = stud_class;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", stud_class=" + stud_class + ", con=" + con + "]";
	}

}
