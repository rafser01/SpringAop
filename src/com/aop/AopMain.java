package com.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MessageWritter target = new MessageWritter();
//		ProxyFactory pf = new ProxyFactory();
//		pf.addAdvice(new MessageDecorator());
//		pf.setTarget(target);
//		MessageWritter messageWritter2 = (MessageWritter) pf.getProxy();
//		messageWritter2.writeMessage();
//		target.writeMessage();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		student.setAge(0);
		
//		student.getAge();

	}

}
