package com.example.demo.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Student
{
	private int id;
	private String name;
	private String address;
	

}
