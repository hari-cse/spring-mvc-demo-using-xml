package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;

	private LinkedHashMap<String, String> favoriteLanguageOptions;
	
	public Student() {
		/**
		 * Here we will set items for Drop-Down component(form:select) and set to 
		 * the tag 
		 * 
		 * <form:select path="country">
		 * <form:options items="${student.countryOptions}"/> 
		 * </form:select">
		 * 
		 * and this procedure is applicable for adding items for radio button having tag
		 * <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/> 
		 * 
		 * 
		//populate country options: used ISO country Code
		//example: IND->key/code and India->value/label
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IND", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("BRA", "Brazil");
		countryOptions.put("FR", "France");
		 */
		//populate favoriteLanguageOptions
		//example: Java->key/code and JAVA->value/label
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "JAVA");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public void setFavoriteLanguageOptions(LinkedHashMap<String, String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}
	
}
