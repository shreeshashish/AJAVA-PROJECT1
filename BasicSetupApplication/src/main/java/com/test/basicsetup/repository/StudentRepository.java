package com.test.basicsetup.repository;

import com.test.basicsetup.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}