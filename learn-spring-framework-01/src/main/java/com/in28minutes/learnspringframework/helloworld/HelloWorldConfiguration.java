package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Luiie";
	}
	
	@Bean
	public int age() {
		return 100;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Ruiie", 200, new Address("Baker Street", "London"));
		return person;
	}
	
	@Bean(name="address2")
	public Address address() {
		var address = new Address("ABC", "abc");
		return address;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
}
