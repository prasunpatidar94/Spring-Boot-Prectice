package com.pp.sun.models;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
@Entity(name = "Usertable")
public class User {
	
	@Id
	@GeneratedValue
	private Long id ;
	private String name ;
	private String email;
	private String password ;
	
	@ElementCollection
	@CollectionTable(name = "rolestable",joinColumns = @JoinColumn(name ="id") )
	@Column(name = "roles")
	private List<String> roles;
	

}
