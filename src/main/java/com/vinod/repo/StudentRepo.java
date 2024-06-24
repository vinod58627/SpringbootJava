/**
 * 
 */
package com.vinod.repo;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vinod.entity.Student;

/**
 * 
 */
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query(value = "select * from test.student \r\n" + "", nativeQuery = true)
	List<Student> studentData();
	
	
	@Query(value = "select * from test.student where roll_no= :id\r\n"
			+ "", nativeQuery = true)
	Map<String, Object> getStudent(int id);
	

}
