package com.ashu.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Vehicle obj=(Vehicle)context.getBean("car");
    	obj.drive();
    	Vehicle obj2=(Vehicle)context.getBean("bike");
    	obj2.drive();
     /* Bike obj=new Bike();
      obj.drive();
      Rather than creating this way we can create bean of vehicle and describe
      bike and car into that
      we can do it in two ways
      1. BeanFactory
      2. ApplicationContext
      
      if we are creating a small application we should use beanfactory
      if we are creating an enterprise level application we should use  ApplicationContext
      getBean("name") is the method to do that
      *
      */
    }
}
