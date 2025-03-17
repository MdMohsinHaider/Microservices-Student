package com.mohsin.studentservice.dto.response;

import com.mohsin.studentservice.dto.Subject;
import com.mohsin.studentservice.entitiy.Student;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentSubjectResponse {
	private Student student;
	private Subject subject;
}

