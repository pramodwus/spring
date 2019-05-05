package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.component.EmployeeService;
import com.app.config.AppConfig;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	
	Object o =ctx.getBean("employeeService");
	EmployeeService es=(EmployeeService)o;
	es.showMsg();
	
}
}
