package com.example.MyRefernces.ValidAndException;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
	@Id
	private Integer id;
	@NotBlank(message = "Name cannot be blank")
	@Size(min =4,max=20,message = "values Should be within range")
	private String name;
	@Email (message = "Email cannot be blank")
	private String email;
	@Size(min =8 ,max=12, message = "password must be between 8 to 12 characters ")
	private String password;
	
	public Student() {}
	
	public Student(Integer id,
			@NotBlank(message = "Name cannot be blank") @Size(min = 4, max = 20, message = "values Should be within range") String name,
			@Email(message = "Email cannot be blank") String email,
			@Size(min = 8, max = 12, message = "password must be between 8 to 12 characters ") String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	

}
