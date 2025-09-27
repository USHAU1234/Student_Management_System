package com.firstProject.Student_Management_System.Controller;

import com.firstProject.Student_Management_System.Model.Student;
import com.firstProject.Student_Management_System.Service.StudentService;
import org.springframework.http.ResponseEntity;//it is used to create http
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;// it will invoke MVC
import org.springframework.web.util.UriComponentsBuilder;// it is for port/location

import java.net.URI;// for location
import java.util.List;

    @RestController
    @RequestMapping("/api/students")
    public class StudentController {

        private final StudentService studentService;

        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }

        // ✅ Create student
        @PostMapping
        public ResponseEntity<Student> createStudent(@Validated @RequestBody Student student,UriComponentsBuilder uriBuilder) {
            Student created = studentService.createStudent(student);
            URI location = uriBuilder.path("/api/students/{id}")
                    .buildAndExpand(created.getId())
                    .toUri();
            return ResponseEntity.created(location).body(created);
        }

        // ✅ Get all students
        @GetMapping
        public ResponseEntity<List<Student>> getAllStudents() {
            return ResponseEntity.ok(studentService.getAllStudents());
        }

        // ✅ Get student by ID
        @GetMapping("/{id}")
        public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
            return ResponseEntity.ok(studentService.getStudentById(id));
        }

        // ✅ Update student
        @PutMapping("/{id}")
        public ResponseEntity<Student> updateStudent(@PathVariable Long id,@Validated @RequestBody Student student) {
            return ResponseEntity.ok(studentService.updateStudent(id, student));
        }

        // ✅ Delete student
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
            studentService.deleteStudent(id);
            return ResponseEntity.noContent().build();
}
}
