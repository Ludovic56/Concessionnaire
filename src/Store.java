import java.util.ArrayList;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.io.Console console = System.console();
		
		ArrayList vehicleArrayList = new ArrayList();
		int mainMenuChoice = 0;
		
		//Main menu
		do{
			System.out.println("1 - Créer un véhicule");
			System.out.println("2 - Voir tous les véhicules");
			System.out.println("3 - Voir un véhicule ne particulier");
			
			System.out.println("0 - Quitter");
			
			mainMenuChoice = Integer.parseInt(console.readLine());
			
			switch(mainMenuChoice){
			case 1:
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;
			
			case 0:
				System.out.println("A bientot !!");
				break;
				
			default:
				System.out.println("Erreur de choix main menu");
				break;
			}
			
		}while(mainMenuChoice != 0);		
	}
	
	
}
