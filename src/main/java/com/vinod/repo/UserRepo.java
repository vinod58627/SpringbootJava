package com.vinod.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.vinod.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value = "select * from test.users \r\n" + "", nativeQuery = true)
	List<User> vinod();

}
