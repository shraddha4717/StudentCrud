package com.example.demo.service;

import java.util.List;

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

	@Override
	public List<Student> getData() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

	@Override
	public Student updateData(Student s, int id) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	
}
