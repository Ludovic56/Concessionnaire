import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import com.iia.shop.entity.Vehicle;

public class Store {

	public static void main (String[] args) {
		// TODO Auto-generated method stub

		java.io.Console console = System.console();
		Scanner scanner = new Scanner(System.in);
		Vehicle vehicle = new Vehicle();

		int mainMenuChoice = 0;
		int chosenVehicle = 0;
		int chosenVehicleMenuChoice = 0;

		// Vehicle attributes
		String brand;
		int year;
		String model;
		String color;
		double price;
		int speed = 0;

		// Main menu
		do {
			System.out.println("1 - Créer un véhicule");
			System.out.println("2 - Voir tous les véhicules");
			System.out.println("3 - Voir un véhicule en particulier");
			System.out.println("4 - Charger le fichier");
			System.out.println("5 - Charger le fichier série");
			
			
			System.out.println("0 - Quitter");

			mainMenuChoice = scanner.nextInt();
			
			switch (mainMenuChoice) {
			case 1:
				// Create vehicle
				vehicle.createVehicle();

				break;

			case 2:
				// Show all vehicles
				vehicle.showAllVehicle();

				break;

			case 3:
				// Show the chosen vehicle
				System.out.println("Choisir un véhicule");
				chosenVehicle = scanner.nextInt();
				vehicle.showOneVehicle(chosenVehicle);

				// Chose to delete or modify selected vehicle
				System.out.println("1 - Supprimer un véhicule");
				System.out.println("2 - Modifier un véhicule");
				System.out.println("3 - Augmenter la vitesse");
				System.out.println("4 - Réduire la vitesse");
				
				
				System.out.println("0 - Quitter");
				chosenVehicleMenuChoice = Integer.parseInt(console.readLine());

				switch (chosenVehicleMenuChoice) {
				case 1:
					// Delete chosen vehicle
					vehicle.deleteVehicle(chosenVehicle);

					break;

				case 2:
					//Modify a vehicle
					vehicle.modifyVehicle(chosenVehicle);
					break;
					
				case 3:
					//Augment vehicle speed
					System.out.println("Saisir la vitesse");
					speed = Integer.parseInt(console.readLine());
					
					vehicle.speedUp(speed, chosenVehicle);
					break;
					
				case 4:
					//Reduce vehicle speed
					System.out.println("Saisir la vitesse");
					speed = Integer.parseInt(console.readLine());
					
					vehicle.speedDown(speed, chosenVehicle);
					break;

				case 0:
					//Exit show vehicle method
					break;

				default:
					System.out.println("Le véhicule n'existe pas");
					break;
				}

				break;
				
			case 4:
				// Load file into arrayList
				vehicle.readFile(vehicle.file, vehicle.vehicleArrayList);

				break;
				
			case 5:
				// Load serial file into arrayList
				vehicle.readObject(vehicle.file, vehicle.vehicleArrayList);

				break;
				
			case 0:
				// Exit program
				System.out.println("A bientot !!");
				break;

			default:
				System.out.println("Erreur de choix main menu");
				break;
			}

		} while (mainMenuChoice != 0);
		
		vehicle.saveObject(vehicle.serialFile, vehicle.vehicleArrayList);
		vehicle.writeFile(vehicle.file, vehicle.vehicleArrayList);
		scanner.close();
	}
	
}
