package com.iia.shop.entity;

import java.util.ArrayList;

public class Vehicle {
	java.io.Console console = System.console();
	
	//Attributes
	private String brand;
	private int year;
	private String model;
	private String color;
	private double price;
	private int speed;
	
	ArrayList<Vehicle> vehicleArrayList = new ArrayList();
	int listSize;
	
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
		this.speed = 0;
	}
	
	public Vehicle() {
		super();
		this.speed = 0;
	}
	
	//Methods
	
	
	public void createVehicle(){		
		System.out.println("Saisir une marque");
		brand = console.readLine();
		System.out.println("Saisir une année");
		year = Integer.parseInt(console.readLine());
		System.out.println("Saisir une modèle");
		model = console.readLine();
		System.out.println("Saisir une couleur");
		color = console.readLine();
		System.out.println("Saisir une prix");
		price = Double.parseDouble(console.readLine());
		
		Vehicle vehicle = new Vehicle(brand, year, model, color, price);
		vehicleArrayList.add(vehicle);
	}
	
	public void modifyVehicle(int choice){
		System.out.println("Saisir une marque");
		brand = console.readLine();
		System.out.println("Saisir une année");
		year = Integer.parseInt(console.readLine());
		System.out.println("Saisir une modèle");
		model = console.readLine();
		System.out.println("Saisir une couleur");
		color = console.readLine();
		System.out.println("Saisir une prix");
		price = Double.parseDouble(console.readLine());
		
		vehicleArrayList.get(choice).setBrand(brand);
		vehicleArrayList.get(choice).setYear(year);
		vehicleArrayList.get(choice).setModel(model);
		vehicleArrayList.get(choice).setColor(color);
		vehicleArrayList.get(choice).setPrice(price);
	}
	
	public void deleteVehicle(int choice){
		vehicleArrayList.remove(choice);
	}
	
	public void showAllVehicle(){
		for (listSize = 0; listSize < vehicleArrayList.size(); listSize++) {
			System.out.println("Marque :" + vehicleArrayList.get(listSize).getBrand());
			System.out.println("Année :" + vehicleArrayList.get(listSize).getYear());
			System.out.println("Modèle :" + vehicleArrayList.get(listSize).getModel());
			System.out.println("Couleur :" + vehicleArrayList.get(listSize).getColor());
			System.out.println("Prix :" + vehicleArrayList.get(listSize).getPrice());
		}
	}
	
	public void showOneVehicle(int choice){
		System.out.println("Marque :" + vehicleArrayList.get(choice).getBrand());
		System.out.println("Année :" + vehicleArrayList.get(choice).getYear());
		System.out.println("Modèle :" + vehicleArrayList.get(choice).getModel());
		System.out.println("Couleur :" + vehicleArrayList.get(choice).getColor());
		System.out.println("Prix :" + vehicleArrayList.get(choice).getPrice());
		System.out.println("Speed :" + vehicleArrayList.get(choice).getSpeed());
	}
	
	public int speedUp(int speed, int choice){
		vehicleArrayList.get(choice).setSpeed(speed);
		return speed;
	}
	
	public int speedDown(int speed, int choice){
		vehicleArrayList.get(choice).setSpeed(speed);
		return speed;
	}
	
}
