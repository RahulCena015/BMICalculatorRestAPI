package com.example.demo.entity;

import lombok.Data;

@Data
public class BMIRequest {
	
	private String name;
	private String age;
	private Double height;
	private Double weight;

}
