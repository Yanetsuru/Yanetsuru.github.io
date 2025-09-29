package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class StudentController {

    @GetMapping("/student")
    public String getStudent(Model model){
        Student student = new Student("Alice", 20);
        model.addAttribute("student", student);
        return "student-view";  // maps to student-view.html
    }
}
