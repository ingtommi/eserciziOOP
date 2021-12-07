package it.univpm.Demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.Demo.filter.APICall;

@RestController
public class Controller {
	
	@Autowired
	
	
	@GetMapping(value = "/tweet/search")
	public APICall apiCall (@RequestParam(name = "query") String query, @RequestParam(name = "count", defaultValue = "10") int count) {
		return new APICall(query,count);
	}
}