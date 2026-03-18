package com.test.basicsetup.service;

import com.test.basicsetup.entity.Student;
import com.test.basicsetup.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository Repo;

    public Student saveStudent(Student s) {
        return Repo.save(s);
    }

    public List<Student> getAllStudents() {
        return Repo.findAll();
    }
}