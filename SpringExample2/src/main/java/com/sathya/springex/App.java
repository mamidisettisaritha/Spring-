package com.sathya.springex;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        // start the spring IOC container
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
    	//get the bean
    	Traveller traveller=context.getBean("traveller",Traveller.class);
    	traveller.startjourney();
    }
}
