package com.luv2code.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")/*countryOptions is file name of properties file mentioned in xml */
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//crate new student object
		Student theStudent = new Student();

		//add student object to the model
		theModel.addAttribute("student",theStudent);
		
		//add countryOptions object to the model
		theModel.addAttribute("countryOptions", countryOptions);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {

		//log the input data
		System.out.println("theStudent: " +theStudent.getFirstName()
		+" " + theStudent.getLastName());
		return "student-confirmation";

	}
}
