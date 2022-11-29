package com.studentmanagementsystem;

import com.studentmanagementsystem.entity.Student;
import com.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
/*        Student student1 = new Student(1, "Jim", "Taylor", "lolkek@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student(2,"Juan","Salazar","peppers4eva@gmail.com");
        studentRepository.save(student2);
        Student student3 = new Student(3,"Tony","robinson","tonybambony@.com");
        studentRepository.save(student2);*/
    }
}
