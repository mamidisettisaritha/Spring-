package com.sathya.springex.Springconfig1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
        System.out.println("***");
        Person person1=context.getBean("person1",Person.class);
        person1.personinfo();
        Person person2=context.getBean("person2",Person.class);
        person2.personinfo();
        Person person3=context.getBean("person3",Person.class);
        person3.personinfo();
    }
}
