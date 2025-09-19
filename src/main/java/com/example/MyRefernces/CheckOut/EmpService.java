package com.example.MyRefernces.CheckOut;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
   @Autowired
	Rep re;

   public List<Employee> adddetails(List<Employee> em) {
	return re.saveAll(em);
	
   }
}
