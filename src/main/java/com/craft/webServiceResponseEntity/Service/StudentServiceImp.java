package com.craft.webServiceResponseEntity.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.craft.webServiceResponseEntity.Model.Student;


@Service
public class StudentServiceImp implements StudentService {
	
	List<Student>list = new ArrayList<>();
	
	
	@Override
	public List<Student> viewAllData() {
		
		
		return list;
	}

	@Override
	public Student insertData(Student student) {
		
		list.add(student);
		
		return student;
	}

	@Override
	public Student findbyId(int id) {
		
		for (Student student : list) {
			
			if(student.getId()==id) {
				
				return student;
			}
			
		}

		return null;
	}
	
	@Override
	public Student updateData(int id , Student student) {
		
		for (Student xyz : list) {
			
			if(xyz.getId()==id) {
				
				xyz.setFirstName(student.getFirstName());
				xyz.setLastName(student.getLastName());
				xyz.setAddress(student.getAddress());
				xyz.setEmail(student.getEmail());
				
				return xyz;
			}
			
		}
		return null;
	}

	@Override
	public String deleteData(int id) {

		for (Student student : list) {
			
			if(student.getId()==id) {
				
				list.remove(student);
				
				return "student data deleted";
			}
			
		}
		
		return "student is not found";
	}

}
