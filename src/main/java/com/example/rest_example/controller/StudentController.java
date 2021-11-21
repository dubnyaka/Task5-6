package com.example.rest_example.controller;

import com.example.rest_example.model.Student;
import com.example.rest_example.model.StudentsGroup;
import com.example.rest_example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentServiceImpl studentsService;

    @Autowired
    public StudentController(StudentServiceImpl studentsService) {
        this.studentsService = studentsService;

//        Student tempStudent = new Student();
//        tempStudent.setName("FirstStudent");
//        tempStudent.setEmail("GGG@GGG");
//        tempStudent.setPhone("14441255");
//        tempStudent.setGroupID(1);
//        studentsService.create(tempStudent);
    }

    @PostMapping(value = "/student")
    public ResponseEntity<?> create(@RequestBody Student student) {
        studentsService.create(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/student")
    public ResponseEntity<List<Student>> read() {
        final List<Student> students = studentsService.readAll();

        return students != null &&  !students.isEmpty()
                ? new ResponseEntity<>(students, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/student/{id}")
    public ResponseEntity<Student> read(@PathVariable(name = "id") int id) {
        final Student student = studentsService.read(id);

        return student != null
                ? new ResponseEntity<>(student, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/student/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Student student) {
        final boolean updated = studentsService.update(student, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/student/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = studentsService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
