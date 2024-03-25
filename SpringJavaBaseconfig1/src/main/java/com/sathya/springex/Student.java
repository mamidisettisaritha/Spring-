package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	//@Autowired
	private EmailService emailService;
	private JavaCourseService javaCourseService;
	
	public  void details()
	{
		emailService.message();
		javaCourseService.courseInfo();
	}

	public EmailService getEmailService() {
		return emailService;
	}
@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public JavaCourseService getJavaCourseService() {
		return javaCourseService;
	}
@Autowired
	public void setJavaCourseService(JavaCourseService javaCourseService) {
		this.javaCourseService = javaCourseService;
	}
	}
	
