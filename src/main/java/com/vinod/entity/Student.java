package com.vinod.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student", schema= "test")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
	public String name;
	public String username;
	public String email;
	public Integer roll_no;
	public String age;
	public String location;
	public String phone;
	public Integer getSno() {
		return id;
	}
	public void setSno(Integer sno) {
		this.id = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sno=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", roll_no="
				+ roll_no + ", age=" + age + ", location=" + location + "]";
	}
	
	
	

}
