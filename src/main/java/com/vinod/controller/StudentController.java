package com.vinod.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.entity.Student;
import com.vinod.entity.StudentRequest;
import com.vinod.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@GetMapping("/studentDetails")
	public ResponseEntity<String> getData(){
		
		return new ResponseEntity<>("Hello world", HttpStatus.OK);
		
	}
	
	@PostMapping("/saveStudentdetails")
	public ResponseEntity<String> saveStudentData(@RequestBody StudentRequest studentReq){
		String saved = service.SaveStudentDetails(studentReq);		
		return ResponseEntity.ok().body(saved);
	}
	
	@GetMapping("/studentData")
	public ResponseEntity<List <Student>> getDatas(){
		List<Student> students = service.getAllStudents();
		
		return ResponseEntity.ok().body(students);
	}
	
	@GetMapping("/getStudent/{id}")
	public Map<String , Object> getDetails(@PathVariable int id){
		return service.getStudentByid(id);
		}
	
	 @PutMapping("/updateStudentdetails/{id}")
	    public ResponseEntity<String> updateStudentData(@PathVariable Integer id, @RequestBody StudentRequest studentReq){
	        String updated = service.updateStudentDetails(id, studentReq);        
	        return ResponseEntity.ok().body(updated);
	    }
	 
	    @DeleteMapping("/deleteStudentdetails/{id}")
	    public ResponseEntity<String> deleteStudentData(@PathVariable Integer id) {
	        String deleted = service.deleteStudentDetails(id);
	        return ResponseEntity.ok().body(deleted);
	    }
	
}
