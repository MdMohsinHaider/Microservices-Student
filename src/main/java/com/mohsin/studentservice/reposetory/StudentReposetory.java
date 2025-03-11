package com.mohsin.studentservice.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohsin.studentservice.entitiy.Student;

@Repository
public interface StudentReposetory extends JpaRepository<Student, Long> {

}
