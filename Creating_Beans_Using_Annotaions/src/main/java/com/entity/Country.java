package com.entity;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
 * //@Scope("singleton") @Scope("prototype") Defines the lifecycle scope of a
 * Spring bean (e.g., singleton, prototype). by default Spring follow singleton
 * design pattern (we can change the design pattern)
 */
public class Country {

	@Value("+91") // like this we can give the value to the variables 
	String c_id;
	@Value("IND")
	String name;

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [c_id=" + c_id + ", name=" + name + "]";
	}

	public Country(String c_id, String name) {
		super();
		this.c_id = c_id;
		this.name = name;
	}

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
}
