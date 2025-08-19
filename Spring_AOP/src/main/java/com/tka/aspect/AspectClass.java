package com.tka.aspect;

import org.aspectj.lang.JoinPoint;
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

//	@Before("execution(* com.tka.entity.BankService.*(..))")
	@Before("execution(public void service())") // we can do like this also
	public void beforeMethod() {
		System.out.println("Check your account balance");
	}

//	@After("execution(* com.tka.entity.BankService.*(..))")
	@After("execution(public void service())") // we can do like this also
	public void afterWithdraw() {

		System.out.println("process is completed");
	}

	// AfterReturning advice: runs after method returns successfully
	@AfterReturning(pointcut = "execution(* com.tka.entity.BankService.*(..))", returning = "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
		System.out.println("✅ @AfterReturning - Method ");
	}

	// AfterThrowing advice: runs if method throws exception
	@AfterThrowing(pointcut = "execution(* com.tka.entity.BankService.*(..))", throwing = "ex")
	public void logAfterThrowing(JoinPoint joinPoint, Exception ex) {
		System.out.println("⚠️ @AfterThrowing - Method ");
	}
	
	@Around("execution(* com.tka.entity.BankService.*(..))")
	public void aroundProcess(ProceedingJoinPoint p) {
		System.out.println("welcome");
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("bye");
		
	}
}
