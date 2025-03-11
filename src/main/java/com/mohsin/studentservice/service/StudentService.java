package com.mohsin.studentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohsin.studentservice.entitiy.Student;
import com.mohsin.studentservice.reposetory.StudentReposetory;

@Service
public class StudentService {
	
	@Autowired
	private StudentReposetory reposetory;
	
	public Student saveStudent(Student student) {
		return reposetory.save(student);
	}
	
	public Optional<Student> getStudentById(long id) {
		return reposetory.findById(id);
	}
	
	public List<Student> getAllStudent(){
		List<Student> list = reposetory.findAll();
		if (list.isEmpty()) {
			return null;
		}
		return list; 
	}

}
