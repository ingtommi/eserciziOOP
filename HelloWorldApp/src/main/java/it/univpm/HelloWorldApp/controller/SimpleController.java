package it.univpm.HelloWorldApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController  
public class SimpleController {  
	
	//utilizzando il defaultValue posso omettere il parametro o scriverlo male (equivale ad ometterlo)
		
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)  
	public String hello(@RequestParam(name = "age", defaultValue = "18") int age, @PathVariable("name") String name) {
		return "Hello " + name + ", you've got " + age + " years"; 
	}
	
	//in hello2() non inserisco defaultValue del parametro e quindi se lo inserisco in maniera errata ho una eccezione
	
	@RequestMapping(value = "/hello2/{name}", method = RequestMethod.GET)  
	public String hello2(@RequestParam(name = "age") int age, @PathVariable("name") String name) {
		return "Hello " + name + ", you're " + age + " year old"; 
	}
}  