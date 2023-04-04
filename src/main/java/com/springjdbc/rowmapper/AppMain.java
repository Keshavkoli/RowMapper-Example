package com.springjdbc.rowmapper;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		System.out.println("AppMain.main():ac:==>"+ac);
		EmployeeDao employeeDao = (EmployeeDao) ac.getBean("employeeDao");
		System.out.println("AppMain.main():employeeDao:==>"+employeeDao);
		// Find By Id!
		Employee emp = employeeDao.findById(3);
		System.out.println("AppMain.main():emp:==>"+emp);
		System.out.println("-------------Find by Id---------------------");
		System.out.println(emp.toString());

//		// Find all!
		Collection<Employee> emplist = employeeDao.findAll();
		System.out.println("AppMain.main():emplist:==>"+emplist);
		System.out.println("-------------Find all---------------------");
		for (Employee employee : emplist) {
			System.out.println(employee.toString());
		}

		// Closing the application context!
		((AbstractApplicationContext) ac).close();

	}
}
