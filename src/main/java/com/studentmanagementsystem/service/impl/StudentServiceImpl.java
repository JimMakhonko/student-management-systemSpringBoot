package com.studentmanagementsystem.service.impl;

import com.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.repository.StudentRepository;
import com.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
return null;
    }
}