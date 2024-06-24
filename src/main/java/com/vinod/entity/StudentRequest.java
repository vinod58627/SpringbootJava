package com.vinod.entity;

public class StudentRequest {
	
	String name;
	String username;
	String email;
	String age;
	Integer rollno;
	String phone;
	String location;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "StudentRequest [name=" + name + ", username=" + username + ", email=" + email + ", age=" + age
				+ ", rollno=" + rollno + ", phone=" + phone + ", location=" + location + "]";
	}
	

}
