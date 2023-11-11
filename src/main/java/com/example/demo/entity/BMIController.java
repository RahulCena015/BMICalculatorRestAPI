package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMIController {
	
	@Autowired
	private BMIService service;
	
	@PostMapping("/getBMI")
	public FinalResponse finalResponse(@RequestBody BMIRequest request) {
		return service.response(request);
		
	}

}
