import java.util.*;
/**
 * This class is the Main Menu of the program.
 */
public class Menu {
	
	/**
	 * This method represents the menu itself.
	 * It's an indefinite do-while loop that allows the user to move to other parts of the program.
	 * It also allows the user to quit.
	 */
	public void menuLoop () {
		
		//Establish the variable that will keep track of the user's choice. Also establish a Scanner to read the user's choice.
		int choice = 0;
		Scanner choicer = new Scanner(System.in);
		System.out.println("Welcome to the GoblinKing enemy-management system.");
		
		//Launch the "menu" by enclosing the user in a do-while loop.
		do {
			System.out.println("Choose an action: \n 1: Create player characters. \n 2: Create enemies. \n 3: Quit.");
			choice = choicer.nextInt();
			if (choice == 1) {
				//TODO: go to the player character creator.
			}
			if (choice == 2) {
				//TODO: go to the enemy creator.
			}
		} while (choice != 3);
		
	}

}
