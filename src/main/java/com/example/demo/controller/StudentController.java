package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student1;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	@PostMapping("/savestudent")
	public Student1 SavestudentDetails(@RequestBody Student1 s) {
		try {
			service.saveStudent(s);
		}catch(Exception e) {
			System.out.println(e);
		}
		return s;
	} 
	@GetMapping("/findById/{id}")
	public Student1 getById(@PathVariable Long id) {
		return service.findById(id);
	}
	@GetMapping("/findByname/{name}")
	public List<Student1> getNames(@PathVariable String name){
		return service.findByname(name);
	}
	@GetMapping("/findBypercent/{percentage}")
	public List<Student1> getPercentage(@PathVariable int percentage){
		return service.findByPercentage(percentage);
	}
	@GetMapping("/findBynameandcollege/{name}/{college}")
	public List<Student1> getCollege(@PathVariable String college){
		return service.findByCollege(college);
	}

 
	}