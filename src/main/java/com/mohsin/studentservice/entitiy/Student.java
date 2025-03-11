package com.mohsin.studentservice.entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	private long id;
	private String name;
	private String email;

}
