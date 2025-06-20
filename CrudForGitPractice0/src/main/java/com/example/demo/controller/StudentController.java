package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	StudentService ss;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student s) 
	{
		return ss.saveData(s);
		
	}
	
	@GetMapping("/student")
	public List<Student> getAllData() 
	{
		return ss.getData();
		
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteData(@PathVariable int id) 
	{
		ss.deleteData(id);
	}

}
