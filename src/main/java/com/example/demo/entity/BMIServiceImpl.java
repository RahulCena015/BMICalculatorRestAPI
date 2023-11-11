package com.example.demo.entity;

import org.springframework.stereotype.Service;

@Service
public class BMIServiceImpl implements BMIService {

	@Override
	public FinalResponse response(BMIRequest request) {
		
		Double pHeight=request.getHeight();
		Double pWeight=request.getWeight();
		String pName=request.getName();
		String pAge=request.getAge();
		
		Double rheight=pHeight*pHeight;
		Double finalResult=pWeight/rheight;
		System.out.println("BMI Calculated is: "+ finalResult);
		
		FinalResponse response=new FinalResponse();
		response.setBMI(finalResult);
		response.setAge(pAge);
		response.setName(pName);
		
		if(finalResult<18.5) {
			response.setStatus("Underweight");
		} else if(finalResult>=18.5 && finalResult<=25) {
			response.setStatus("Healthy");
		} else if(finalResult>=25 && finalResult<=30) {
			response.setStatus("Overweight");
		} else if(finalResult>=30) {
			response.setStatus("Obese");
		}
		
		return response;
	}

}


//below 18.5 is underweight
//between 18.5 and 24.9 is healthy
//between 25 and 29.9 is overweight
//of 30 or over is obese