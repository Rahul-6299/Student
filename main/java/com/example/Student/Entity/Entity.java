package com.example.Student.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.example.Student.Appconstants.Appconstants;

import lombok.Data;
@Data
@javax.persistence.Entity
@Table(name=Appconstants.STUDENT_INFO)

public class Entity implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="gmailid")
	private String gmail;

}
