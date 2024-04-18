package com.craft.webServiceResponseEntity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.craft.webServiceResponseEntity.Model.Student;
import com.craft.webServiceResponseEntity.Service.StudentService;

@RestController
@RequestMapping("/api/v1")
public class Controllers {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/student")
	public ResponseEntity<?> viewAllStudent(){
		
		try {
			
			return new ResponseEntity<List<Student>> (studentService.viewAllData(), HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<> (e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PostMapping("/student")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		
		return new ResponseEntity<>(studentService.insertData(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") int id ) {
		
		return new ResponseEntity<> (studentService.findbyId(id), HttpStatus.FOUND);
	}
	
	@PutMapping("/student")
	public ResponseEntity<?> updateStudentData(@RequestParam(name = "id", required = true) int id , @RequestBody Student student ) {
		
		return new ResponseEntity<>(studentService.updateData(id, student), HttpStatus.OK);
	}
	
	@DeleteMapping("/student/{id}")
	public ResponseEntity<?> deleteStudentData(@PathVariable("id") int id) {
		
		return new ResponseEntity<>(studentService.deleteData(id), HttpStatus.OK);
	}

}
