package com.example.Student.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.Entity;


@org.springframework.stereotype.Repository

public interface Repository extends JpaRepository<Entity, Long>{
	
	

}
