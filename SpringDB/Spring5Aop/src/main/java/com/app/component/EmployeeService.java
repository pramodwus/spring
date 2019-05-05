package com.app.component;

import org.springframework.stereotype.Service;

@Service	
public class EmployeeService {

	public void showMsg()
	{
		int x=9;
		if(x>=0)throw new RuntimeException("Test Exception");
			
		
		System.out.println("Hello  from b.method() ");
	}
	
}
