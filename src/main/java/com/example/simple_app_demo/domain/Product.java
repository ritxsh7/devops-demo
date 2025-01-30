package com.example.simple_app_demo.domain;
import jakarta.persistence.*;

@Entity
public class Product{

@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;

private String name;


public Product() {
	// TODO Auto-generated constructor stub
}


public Product(String name) {
	this.name = name;
}


public Integer getId(){
return this.id;
}
public void setId(Integer id){
 this.id = id;
}


public String getName(){
return this.name;
}
public void setName(String name){
 this.name = name;
}

} 
