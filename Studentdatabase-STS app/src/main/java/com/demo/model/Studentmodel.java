package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Studentmodel 
{
	@Id
	private int id;
	private String name;
	private double per;
	private String result;
	
		
	public Studentmodel() {
		super();
		
	}
	public Studentmodel(int id, String name, double per, String result) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		this.result = result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Studentmodel [id=" + id + ", name=" + name + ", per=" + per + ", result=" + result + "]";
	}
	
	

}
