package com.mohsin.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  @SpringBootApplication
 *  is a Combination of three annotation
 *  @Configuration, 
 *  @EnableAutoConfiguration, 
 *  @ComponentScan
 */
@SpringBootApplication
@EnableFeignClients
public class StudentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentserviceApplication.class, args);
	}
	
//	@Bean
//	RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	

}
