package com.mohsin.studentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohsin.studentservice.dto.response.StudentSubjectResponse;
import com.mohsin.studentservice.entitiy.Student;
import com.mohsin.studentservice.service.StudentService;

@RestController
@RequestMapping(value = "/api/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student saveStrudentController(@RequestBody Student student) {
		System.out.println(student);
		return service.saveStudent(student);
	}
	
	@GetMapping(value = "/id/{id}")
	public StudentSubjectResponse getStudentById(@PathVariable long id) {
		return service.getStudentById(id);
	}
	
	@GetMapping
	public List<Student> getAllStudentController(){
		return service.getAllStudent();
	}

}
