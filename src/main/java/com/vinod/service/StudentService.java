package com.vinod.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.entity.Student;
import com.vinod.entity.StudentRequest;
import com.vinod.repo.StudentRepo;
import java.util.Optional;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo sturepo;

	public String SaveStudentDetails(StudentRequest studentReq) {
		String message = "Save Failed";
		if(studentReq != null) {
			Student student = new Student();
			student.setName(studentReq.getName());
			student.setUsername(studentReq.getUsername());
			student.setEmail(studentReq.getEmail());
			student.setRoll_no(studentReq.getRollno());
			student.setAge(studentReq.getAge());
			student.setLocation(studentReq.getLocation());
			student.setPhone(studentReq.getPhone());
			sturepo.save(student);
            message = "Employee details Saved Successfully";
		}
		return message;
	}

	public List<Student> getAllStudents() {
		return sturepo.studentData();
	}
	
    public Map<String , Object> getStudentByid(Integer id){
    	System.out.println(id);
    	return sturepo.getStudent(id);
    	
    }
	
	public String updateStudentDetails(Integer id, StudentRequest studentReq) {
        String message = "Update Failed";
        Optional<Student> optionalStudent = sturepo.findById(id);
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            student.setName(studentReq.getName());
            student.setUsername(studentReq.getUsername());
            student.setEmail(studentReq.getEmail());
            student.setRoll_no(studentReq.getRollno());
            student.setAge(studentReq.getAge());
            student.setLocation(studentReq.getLocation());
            student.setPhone(studentReq.getPhone());
            sturepo.save(student);
            message = "Student details updated successfully";
        } else {
            message = "Student not found with id " + id;
        }
        return message;
    }

	public String deleteStudentDetails(Integer id) {
        String message = "Delete Failed";
        if (id != null) {
            Optional<Student> optionalStudent = sturepo.findById(id);
            if (optionalStudent.isPresent()) {
            	sturepo.delete(optionalStudent.get());
                message = "Student details deleted successfully";
            } else {
                message = "Student not found with id " + id;
            }
        }
        return message;
    }


}
