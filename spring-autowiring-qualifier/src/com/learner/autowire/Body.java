package com.learner.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Body {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("Newfile.xml");
	
}
}
