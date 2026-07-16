package com.placement.placementportal.controller;

import com.placement.placementportal.entity.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public String getStudents() {
        return "Student API Working";
    }

    @GetMapping("/{id}")
    public String getStudentById(@PathVariable int id) {
        return "Student ID : " + id;
    }

    @GetMapping("/search")
    public String getStudentByRequestParam(@RequestParam int id) {
        return "Student ID : " + id;
    }

    @GetMapping("/details")
    public Student getDetails(){
        Student s1 = new Student(83,"Mohan Sanjai K","CSE");
        return s1;
    }
    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return student;
    }
}
