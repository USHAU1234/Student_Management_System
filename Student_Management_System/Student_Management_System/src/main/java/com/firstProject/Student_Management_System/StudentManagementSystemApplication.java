package com.firstProject.Student_Management_System;

import com.firstProject.Student_Management_System.Model.Student;
import com.firstProject.Student_Management_System.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository studentRepository) {
		return (args) -> {
			// Insert some sample data
			Student s1 = new Student();
			s1.setName("Alice");
			s1.setEmail("alice@email.com");
			studentRepository.save(s1);

			Student s2 = new Student();
			s2.setName("Bob");
			s2.setEmail("bob@email.com");
			studentRepository.save(s2);

			// Test existsByEmail
			System.out.println(studentRepository.existsByEmail("alice@email.com")); // true
			System.out.println(studentRepository.existsByEmail("john@email.com"));  // false
  };
}
}


