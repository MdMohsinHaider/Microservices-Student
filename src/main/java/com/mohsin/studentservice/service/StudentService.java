package com.mohsin.studentservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mohsin.studentservice.client.StudentSubjectClient;
import com.mohsin.studentservice.dto.Subject;
import com.mohsin.studentservice.dto.response.StudentSubjectResponse;
import com.mohsin.studentservice.entitiy.Student;
import com.mohsin.studentservice.reposetory.StudentReposetory;

@Service
public class StudentService {
	
	@Autowired
	private StudentReposetory reposetory;
	
//	@Autowired
//	private RestTemplate restTemplate;
	
	@Autowired
	private StudentSubjectClient client;
	
	public Student saveStudent(Student student) {
		return reposetory.save(student);
	}
	
	public StudentSubjectResponse getStudentById(long id) {
		// get Student By Student Id
		Student student = reposetory.findById(id).orElseThrow(()->new RuntimeException("given student id not found!!!"));
		// find Student id from Student which is get
		int subjectId = student.getSubjectid();
		
//		// get subject by Subject id throw Subject End Point or API
//		ResponseEntity<Subject> subject = restTemplate.getForEntity("http://localhost:8082/api/subject/id/"+subjectId, Subject.class);
//		if (restTemplate ==null) {
//			throw new IllegalStateException("RestTemplate is not initialized properly");			
//		}
//		Subject subject2 = subject.getBody();
//		System.out.println(subject2);
		// return student with Student and subject
		
		
		
		// open feign spring cloud
		Optional<Subject> subject = client.findSubjectByIdController(subjectId);
		if (!subject.isPresent()) return null;
		Subject subject1 = subject.get();
		return StudentSubjectResponse.builder().student(student).subject(subject1).build();
		
	}
	
	public List<Student> getAllStudent(){
		List<Student> list = reposetory.findAll();
		if (list.isEmpty()) {
			return null;
		}
		return list; 
	}

}
