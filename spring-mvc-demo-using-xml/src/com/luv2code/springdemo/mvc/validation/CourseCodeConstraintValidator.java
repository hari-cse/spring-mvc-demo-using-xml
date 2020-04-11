package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	/*
	 * for single value validation 
	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	 */
	private String[] coursePrefixes;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefixes = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result = false ;
		/*
		 * for single value validation
		if(theCode != null) {
			result = theCode.startsWith(coursePrefix);
		} 
		 */
		if(theCode != null) {
			for(String coursePrefix : coursePrefixes) {
				result = theCode.startsWith(coursePrefix);
				if(result) {
					break;
				} 
			}
		} 
		else {
			result = true;
		}
		return result;
	}

}
