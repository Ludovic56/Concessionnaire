package com.iia.shop.entity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle implements Serializable{
	java.io.Console console = System.console();
	Scanner scanner = new Scanner(System.in);

	// Path to save/read file
	File serialFile = new File("C:\\Users\\LLECOR\\Documents\\concessionnaire.txt");

	// Attributes
	private String brand;
	private int year;
	private String model;
	private String color;
	private double price;
	private int speed;

	ArrayList<Vehicle> vehicleArrayList = new ArrayList();
	int listSize;

	// Getters & Setters
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

	// Constructors
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

	// Methods

	public void createVehicle() {
		System.out.println("Saisir une marque");
		brand = scanner.nextLine();
		System.out.println("Saisir une année");
		year = scanner.nextInt();
		System.out.println("Saisir une modèle");
		model = scanner.nextLine();
		System.out.println("Saisir une couleur");
		color = scanner.nextLine();
		System.out.println("Saisir une prix");
		price = scanner.nextDouble();

		Vehicle vehicle = new Vehicle(brand, year, model, color, price);

		vehicleArrayList.add(vehicle);
	}

	public void modifyVehicle(int choice) {
		System.out.println("Saisir une marque");
		brand = scanner.nextLine();
		System.out.println("Saisir une année");
		year = scanner.nextInt();
		System.out.println("Saisir une modèle");
		model = scanner.nextLine();
		System.out.println("Saisir une couleur");
		color = scanner.nextLine();
		System.out.println("Saisir une prix");
		price = scanner.nextDouble();

		vehicleArrayList.get(choice).setBrand(brand);
		vehicleArrayList.get(choice).setYear(year);
		vehicleArrayList.get(choice).setModel(model);
		vehicleArrayList.get(choice).setColor(color);
		vehicleArrayList.get(choice).setPrice(price);
	}

	public void deleteVehicle(int choice) {
		vehicleArrayList.remove(choice);
	}

	public void showAllVehicle() {
		for (listSize = 0; listSize < vehicleArrayList.size(); listSize++) {
			System.out.println("Marque :" + vehicleArrayList.get(listSize).getBrand());
			System.out.println("Année :" + vehicleArrayList.get(listSize).getYear());
			System.out.println("Modèle :" + vehicleArrayList.get(listSize).getModel());
			System.out.println("Couleur :" + vehicleArrayList.get(listSize).getColor());
			System.out.println("Prix :" + vehicleArrayList.get(listSize).getPrice());
		}
	}

	public void showOneVehicle(int choice) {
		System.out.println("Marque :" + vehicleArrayList.get(choice).getBrand());
		System.out.println("Année :" + vehicleArrayList.get(choice).getYear());
		System.out.println("Modèle :" + vehicleArrayList.get(choice).getModel());
		System.out.println("Couleur :" + vehicleArrayList.get(choice).getColor());
		System.out.println("Prix :" + vehicleArrayList.get(choice).getPrice());
		System.out.println("Speed :" + vehicleArrayList.get(choice).getSpeed());
	}

	public int speedUp(int speed, int choice) {
		vehicleArrayList.get(choice).setSpeed(speed);
		return speed;
	}

	public int speedDown(int speed, int choice) {
		vehicleArrayList.get(choice).setSpeed(speed);
		return speed;
	}

	public void readFile(File file, ArrayList<Vehicle> vehicleArrayList) {
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);

			int indexArray = 0;
			while (buffer.ready()) {
				for (int index = 1; index < 5; index++) {
					switch (index) {
					case 1:
						vehicleArrayList.get(indexArray).setBrand(buffer.readLine());
						break;

					case 2:
						vehicleArrayList.get(indexArray).setYear(Integer.parseInt(buffer.readLine()));
						break;

					case 3:
						vehicleArrayList.get(indexArray).setModel(buffer.readLine());
						break;

					case 4:
						vehicleArrayList.get(indexArray).setColor(buffer.readLine());
						break;

					case 5:
						vehicleArrayList.get(indexArray).setPrice(Double.parseDouble(buffer.readLine()));
						index = 0;
						break;

					default:
						break;
					}

				}
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readObject(File file) {

		try {
			FileInputStream in = new FileInputStream(file);
			ObjectInputStream objectIn = new ObjectInputStream(in);

			Vehicle vehicule = (Vehicle) objectIn.readObject();

			objectIn.close();
			System.out.println("Marque de la voiture : " + vehicule.getBrand() + "\n" + "Modele de la voiture : "
					+ vehicule.getModel());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeFile(File file, ArrayList<Vehicle> vehicleArrayList) {
		try {
			int indexArray = 0;
			FileWriter writer = new FileWriter(file, true);

			BufferedWriter buffer = new BufferedWriter(writer);
			String stringPrice;
			
			for (int index = 1; index < 5; index++) {			
				
				switch (index) {
				case 1:
					buffer.write(vehicleArrayList.get(indexArray).getBrand());
					buffer.newLine();
					break;

				case 2:
					buffer.write(vehicleArrayList.get(indexArray).getYear());
					buffer.newLine();
					break;

				case 3:
					buffer.write(vehicleArrayList.get(indexArray).getModel());
					buffer.newLine();
					break;

				case 4:
					buffer.write(vehicleArrayList.get(indexArray).getColor());
					buffer.newLine();
					break;

				case 5:
					stringPrice = String.valueOf(vehicleArrayList.get(indexArray).getYear());
					buffer.write(stringPrice);
					buffer.newLine();
					index = 0;
					break;

				default:
					break;
				}
			}

			buffer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void saveObject(File file, ArrayList<Vehicle> vehicleArrayList) {
		try {
			FileOutputStream out = new FileOutputStream(file, true);
			ObjectOutputStream objectOutput = new ObjectOutputStream(out);			
			
			for (Vehicle vehicle : vehicleArrayList) {
				objectOutput.writeObject(vehicle);
			}
			
			objectOutput.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
