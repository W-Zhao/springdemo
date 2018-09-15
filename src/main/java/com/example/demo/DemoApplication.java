package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Config config = context.getBean(Config.class);
		Environment environment=context.getEnvironment();
//		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = context.getBean(PropertySourcesPlaceholderConfigurer.class);
//		System.out.println(propertySourcesPlaceholderConfigurer);
//		String name = environment.getProperty("com.zhao.name");
//		System.out.println("env:"+name);
//		System.out.println(config);
		context.close();

	}
}
