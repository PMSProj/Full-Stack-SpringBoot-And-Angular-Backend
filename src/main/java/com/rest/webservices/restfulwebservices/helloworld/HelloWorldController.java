package com.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


//Controller
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {

	@GetMapping(path="/hello-world")	
	public String helloWorld(){
//		throw new RuntimeException("Some Error has occurred");
		return  "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")	
	public HelloWorldBean helloWorldBean(){
//		throw new RuntimeException("Some Error has occurred");
		return  new HelloWorldBean("Hello World- changed");
	}
	@GetMapping(path="/hello-world/path-variable/{name}")	
	public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
//		throw new RuntimeException("Some Error has occurred");
		return  new HelloWorldBean(String.format("Hello World,%s",name));
	}
	
}
