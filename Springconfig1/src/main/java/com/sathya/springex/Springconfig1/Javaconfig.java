package com.sathya.springex.Springconfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
	@Configuration
	public class Javaconfig {
		@Bean
		public Person person1()
		{
			Person person1=new Person();
			person1.setName("saritha");
			person1.setEmail("sari@gmail.com");
			return person1;
		}
		@Bean
			public Person person2()
			{
				Person person2=new Person();
				person2.setName("Kavitha");
				person2.setEmail("kavi@gmail.com");
				return person2;
			}
		@Bean
				public Person person3()
				{
					Person person3=new Person();
					person3.setName("simla");
					person3.setEmail("sim@gmail.com");
					return person3;
				}
			
		
	}
