/**
 * 
 */
package com.vinod.entity;

/**
 * 
 */
public class UserRequest {

	Integer id;
	String name;
	String username;
	String email;
	Integer phone;
	String website;
	public UserRequest(Integer id,String name, String username, String email, Integer phone, String website) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.website = website;
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
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UserRequest [id="+id+",  name=" + name + ", username=" + username + ", email=" + email + ", phone=" + phone
				+ ", website=" + website + "]";
	}
	
}
