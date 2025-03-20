package com.mohsin.studentservice.client;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mohsin.studentservice.dto.Subject;


@FeignClient(url ="localhost:8082", value="subjectservice")
public interface StudentSubjectClient {

	@GetMapping(value = "/api/subject/id/{id}")
	public Optional<Subject> findSubjectByIdController(@PathVariable long id);
}
