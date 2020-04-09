package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		/**
		 * Here we will set items for Drop-Down component(form:select) and set to 
		 * the following tag
		 * <form:options items="${student.countryOptions}"/>
		 * student->className and countryOptions->attribute name
		 * 
		//populate country options: used ISO country Code
		//example: IND->key/code and India->value/label
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FR", "France");
		 */
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
}
