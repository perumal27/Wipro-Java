package com.pack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestEmployee {
	public static void main(String[] args) {
		
		ApplicationContext apcon = new ClassPathXmlApplicationContext("aplicationContext.xml");
		Employee emp1 = (Employee) apcon.getBean("empObj",Employee.class);
		Employee emp2 = (Employee) apcon.getBean("empObj",Employee.class);
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp2);
		
	}

}
