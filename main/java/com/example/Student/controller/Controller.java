package com.example.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.Appconstants.Appconstants;
import com.example.Student.Entity.Entity;
import com.example.Student.service.Service;

@RestController
@RequestMapping(value= Appconstants.STUDENT_CONTROLLER)


public class Controller {
	@Autowired
	public Service ser;
	
	@PostMapping(value=Appconstants.STUDENT_SAVE)
	
	public void save( @RequestBody Entity en)
	{
		ser.save(en);
	}
	@GetMapping(value=Appconstants.STUDENT_GETALL)
	public @ResponseBody List<Entity> getall()
	{
		return ser.getall();
	}
	@GetMapping(value=Appconstants.STUDENT_GETBYID)
	public Entity getbyid(@PathVariable Long id)
	{
		return ser.getbyid(id);
	}
	@DeleteMapping(value=Appconstants.STUDENT_DELETEBYID)
	public void save(@RequestBody Long id)
	{
		ser.deletebyid(id);
	}
	@PutMapping(value=Appconstants.STUDENT_UPDATEBYID)
	public ResponseEntity<Entity>updatebyid(@PathVariable Long id,@RequestBody String name)
	{
		Entity en=ser.updatebyid(id, name);
		return ResponseEntity.ok(en);
	}
	@DeleteMapping(value=Appconstants.STUDENT_DELETEALL)
	public void deleteAll() {
		ser.deleteAll();
	}
	
	}

