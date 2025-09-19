package com.example.MyRefernces.CheckOut;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	
	private Integer id;
	private String name;
	private String dept;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	private LocalDateTime updateDate;
	public User() {}
	public User(Integer id, String name, String dept, LocalDateTime createDate, LocalDateTime updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.createDate = createDate;
		this.updateDate = updateDate;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
