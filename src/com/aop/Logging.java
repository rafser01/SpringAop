package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	
	@Before("execution(* com.aop.Student.setAge*(int)) && args(intVal)")
	public void beforeAdmin(int intVal) {
		System.out.println("Before advice hit"+intVal);
	}

	@After("execution(* com.aop.Student.setAge*(int))")
	public void AfterSetAge() {
		System.out.println("After advice hit");
	}

}
