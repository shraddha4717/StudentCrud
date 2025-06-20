package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository sr;

	@Override
	public Student saveData(Student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

}
