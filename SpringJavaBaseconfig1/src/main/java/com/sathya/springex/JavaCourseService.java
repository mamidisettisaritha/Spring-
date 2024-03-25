package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void courseInfo() {
		System.out.println("Welcome to java full stack");
		System.out.println("javascript,springboot,bootstrap,reactjs");
		
	}
	public JavaCourseService()
	{
		System.out.println("Object is created");
	}

}
