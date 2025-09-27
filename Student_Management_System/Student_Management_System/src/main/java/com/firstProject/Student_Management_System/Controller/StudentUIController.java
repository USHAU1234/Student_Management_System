package com.firstProject.Student_Management_System.Controller;


import com.firstProject.Student_Management_System.Model.Student;
import com.firstProject.Student_Management_System.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

// Controller for Thymeleaf-based UI
@Controller
@RequestMapping("/students-ui")
public class StudentUIController {

    private final StudentService studentService;

    public StudentUIController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✅ Show list of students
    @GetMapping
    public String viewStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; // → templates/students.html
    }

    // ✅ Show add student form
    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student"; // → templates/add-student.html
    }

    // ✅ Handle save student
    @PostMapping
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.createStudent(student);
        return "redirect:/students-ui";
    }

    // ✅ Show edit form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "edit-student"; // → templates/edit-student.html
    }

    // ✅ Handle update student
    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student) {
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setName(student.getName());
        existingStudent.setName(student.getName());
        existingStudent.setEmail(student.getEmail());

        studentService.createStudent(existingStudent);
        return "redirect:/students-ui";
    }

    // ✅ Delete student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students-ui";
}
}