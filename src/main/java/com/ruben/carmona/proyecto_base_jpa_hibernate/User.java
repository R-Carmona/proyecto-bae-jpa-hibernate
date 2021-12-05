package com.ruben.carmona.proyecto_base_jpa_hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
	
	@Id
	private int id;
	
	@Column
	private String userName;
	
	@Column
	private String userMesagge;	
	
	
}
