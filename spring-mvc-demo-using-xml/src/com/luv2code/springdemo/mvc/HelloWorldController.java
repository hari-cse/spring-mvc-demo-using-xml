package com.luv2code.springdemo.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") /*parent mapping is added to remove Ambiguous mapping error when another controller has 
same relative mappings of this controller with them and update URL's in required files*/
public class HelloWorldController {

	//method to show html form
	@RequestMapping("/showForm") /*sub mapping (relative)*/
	public String showForm() {
		return "helloworld-form"; /* jsp file name*/
	}
	
	//method to process html form
	@RequestMapping("/processForm") /*sub mapping (relative)*/
	public String processForm() {
		return "hellowworld";
	}
	
	//new controller method to read form data and data to the model
	@RequestMapping("/processFormVersionTwo") /*sub mapping (relative)*/
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//read request param from html form
		String theName = request.getParameter("studentName");
		
		//convert data to caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "yo! " + theName;
		
		//add message to model
		model.addAttribute("message", result);/*message->attribute and result->value*/
		return "hellowworld";
	}
	
	@RequestMapping("/processFormVersionThree") /*sub mapping (relative)*/
	public String processFormVersionThree(@RequestParam("studentName") String theName, 
			Model model) {
		
		//convert data to caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Hey My Friend from v3! " + theName;
		
		//add message to model
		model.addAttribute("message", result);/*message->attribute and result->value*/
		return "hellowworld";
	}
}
