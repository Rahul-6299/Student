package com.example.Student.service;


import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Student.Entity.Entity;
import com.example.Student.repository.Repository;

@org.springframework.stereotype.Service

public class Service {
	@Autowired
	
	private Repository repo;
	public void save(Entity en)
	{
		repo.save(en);
	}
	public List<Entity>getall()
	{
		return repo.findAll();
	}
	public Entity getbyid(Long id)
	{
		return repo.findById(id).orElse(null);
		
	}
	public void deletebyid(Long id)
	{
		repo.deleteById(id);
	}
	
	public Entity updatebyid(Long id,String name)
	{
		Optional<Entity>op=repo.findById(id);
		if(op.isPresent())
		{
			Entity en=op.get();
			en.setName(name);
			return repo.save(en);
		}
		else
		{
			throw new EntityNotFoundException("Entity with id"+id+"notfound");
		}
	}
	
	
	 
	public void deleteAll() {
		repo.deleteAll();
	}
	

}
