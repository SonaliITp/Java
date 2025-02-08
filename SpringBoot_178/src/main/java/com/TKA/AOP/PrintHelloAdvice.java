package com.TKA.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintHelloAdvice {

	@Around("execution(* com.TKA.service.WcWorldcupService.allIndianCricketStaffCount())")
	public Object printHello(ProceedingJoinPoint p) throws Throwable
	{ 
		System.err.println("Hello");
		Object result = p.proceed();
		System.err.println("Bye");
		return result;
		
	}
}
