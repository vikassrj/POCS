package com.vikas.poc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Intercept {

	@Around("execution(* com.vikas.poc.pojo.*.*(..))")
	public Object addLogger(ProceedingJoinPoint p) {
		System.out.println("Arround Advice before" + p.getSignature());
		Object proceed = null;
		try {
			 proceed = p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Arround Advice after" + p.getSignature());
		return proceed;
	}
}
