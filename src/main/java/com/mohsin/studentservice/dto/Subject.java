package com.mohsin.studentservice.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Subject {
	private long id;
	private String name;
	private String auther;
}
