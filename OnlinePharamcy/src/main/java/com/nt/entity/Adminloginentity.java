package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Admin_Login")
public class Adminloginentity {
	@Id
	@GeneratedValue
	private Integer Aid;
	private String name;
	private String password;

}
