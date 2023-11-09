package com.jsp.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml") ;
      Employee emp1=context.getBean("emp1",Employee.class);
      System.out.println(emp1);
    }
}
