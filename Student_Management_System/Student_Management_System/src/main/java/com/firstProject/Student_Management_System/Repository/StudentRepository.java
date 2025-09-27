package com.firstProject.Student_Management_System.Repository;

import com.firstProject.Student_Management_System.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByEmail(String email);
}

