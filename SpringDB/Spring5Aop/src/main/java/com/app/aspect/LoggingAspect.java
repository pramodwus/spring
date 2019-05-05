package com.app.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public * sh*(..))")
	public void point1()
	{
		
	}
	
	@AfterReturning(pointcut="point1()",returning="ob")
public void showLog(Object ob) {
		System.out.println(" After Success :"+ob);
	}
		@AfterThrowing(pointcut="point1()",throwing="th")
		public void onFailure(Throwable th) {
			System.out.println("After Failure :"+th);
		}
	}
	
	
	

