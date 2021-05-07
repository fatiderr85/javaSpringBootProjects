package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {

	@Before("execution(* com.example.demo.Example.fatima())")
	public void derr() {
		System.err.println("Before pointcut executed");

	}

	@After("execution(* com.example.demo.Example.nihal())")
	public void nihal() {
		System.err.println("After pointcut executed");
	}

	@Around("execution(* com.example.demo.Example.miral())")
	public void miral(ProceedingJoinPoint joinPoint) throws Throwable {
		System.err.println("Before the method miral()");
		Object result = joinPoint.proceed();
		System.err.println("After the method miral()");

	}
	@AfterReturning("execution(* com.example.demo.Example.wassim())")
	public void wassim() {
		System.err.println("After Returning from wassim()");
		
	}
	@AfterThrowing("execution(* com.example.demo.Example.khalid())")
	public void khalid() {
		
		System.err.println("After Throwing khalid()");
	}
}
