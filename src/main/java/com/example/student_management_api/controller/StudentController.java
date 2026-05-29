package com.example.student_management_api.controller;

import com.example.student_management_api.dto.StudentRequestDTO;
import com.example.student_management_api.dto.StudentResponseDTO;
import com.example.student_management_api.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // POST - Create a new student
    @PostMapping
    public ResponseEntity<StudentResponseDTO> createStudent(@Valid @RequestBody StudentRequestDTO request) {
        StudentResponseDTO saved = studentService.createStudent(request);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // GET - Get all students
    @GetMapping
    public List<StudentResponseDTO> getAllStudents() {
        return studentService.getAllStudents();
    }

    // GET - Get student by id
    @GetMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable Long id) {
        StudentResponseDTO student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    // PUT - Update a student
    @PutMapping("/{id}")
    public ResponseEntity<StudentResponseDTO> updateStudent(@PathVariable Long id, @Valid @RequestBody StudentRequestDTO request) {
        StudentResponseDTO updated = studentService.updateStudent(id, request);
        return ResponseEntity.ok(updated);
    }

    // DELETE - Delete a student
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
