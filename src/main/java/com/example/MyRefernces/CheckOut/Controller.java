package com.example.MyRefernces.CheckOut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	EmpService ser;
	@PostMapping("/add")
	public List<Employee> add(@RequestBody List<Employee> e) {
		
		return ser.adddetails(e);
	}
}
