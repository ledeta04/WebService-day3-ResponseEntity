package com.craft.webServiceResponseEntity.Service;

import java.util.List;

import com.craft.webServiceResponseEntity.Model.Student;


public interface StudentService {
	
	
	public List<Student> viewAllData();
	public Student insertData(Student student);
	public Student findbyId(int id);
	public Student updateData(int id, Student student);
	public String deleteData(int id);
	
}
