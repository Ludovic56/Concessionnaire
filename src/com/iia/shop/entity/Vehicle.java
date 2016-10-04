package com.iia.shop.entity;

public class Vehicle {
	//Attributes
	private String brand;
	private int year;
	private String model;
	private String color;
	private double price;
	private int speed;
	
	
	//Getters & Setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	//Constructors
	public Vehicle(String brand, int year, String model, String color, double price) {
		super();
		this.brand = brand;
		this.year = year;
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	//Methods
	
	public void createVehicle(){		
		
	}
	
	public void modifyVehicle(){
		
	}
	
	public void deleteVehicle(){
		
	}
	
	public void showAllVehicle(){
		
	}
	
	public void showOneVehicle(){
		
	}
	
	public void speedUp(){
		
	}
	
	public void speedDown(){
		
	}
	
}
