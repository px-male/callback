package model;

import java.io.Serializable;

public class Health implements Serializable {

	private double height;
	private double weight;
	private double bmi;
	private String bodyType;
	
	public void Health(){
		
	}
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	public String getBodytype() {
		return bodyType;
	}
	public void setBodytype(String bodyType) {
		this.bodyType = bodyType;
	}
	
	
}
