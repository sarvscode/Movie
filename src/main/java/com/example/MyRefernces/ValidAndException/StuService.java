package com.example.MyRefernces.ValidAndException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuService {
    @Autowired
	StuRepo repo;
}
