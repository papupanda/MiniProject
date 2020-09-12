package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "User_Login")
public class Userloginentity {
	@Id
	@GeneratedValue
	private Integer Uid;
	private String name;
	private String password;

}
