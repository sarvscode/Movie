package com.example.MyRefernces.CheckOut;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;

public interface UserRep  extends JpaRepository<User, Integer>{
    @Modifying
    @Transactional
	@Query(value = "update user set dept='FSD' where id =10",nativeQuery = true)
	public void update();

}
