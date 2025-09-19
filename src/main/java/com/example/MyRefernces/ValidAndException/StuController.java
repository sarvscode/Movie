package com.example.MyRefernces.ValidAndException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {
	 
  @Autowired
	StuService service;
	public String addvalues(@RequestBody Student s ) {
		return service
	}
}
