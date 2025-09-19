package com.example.MyRefernces.CheckOut;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rep extends JpaRepository<Employee, Integer>{

	

}
