package org.yong.flee.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	@Pointcut("execution(* org.yong.spring.aop.service..*.login(..))")
	public void logPoint(){
		
	}

	@Before("logPoint()")
	public void logPrintln() {
		System.out.println("log : user login ");
	}
	
}
