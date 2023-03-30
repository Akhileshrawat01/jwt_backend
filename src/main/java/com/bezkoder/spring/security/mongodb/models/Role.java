package com.bezkoder.spring.security.mongodb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "roles")
@Entity
@Table(name = "roles")
public class Role {


//  public Role() {
//
//  }
	
  @Column(name = "name", length = 128, nullable = true, unique = false)
  private ERole name;
  public Role(ERole name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }
  @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "id")
  private String id;
  public void setId(String id) {
    this.id = id;
  }

  public ERole getName() {
    return name;
  }

  public void setName(ERole name) {
    this.name = name;
  }
}
