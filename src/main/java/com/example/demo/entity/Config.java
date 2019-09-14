package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "config", schema = "test")
public class Config {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String appName;
}
