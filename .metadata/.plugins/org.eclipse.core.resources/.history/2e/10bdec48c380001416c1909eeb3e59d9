import java.io.FileNotFoundException;
import java.util.*;
/**
 * This class is the Main Menu of the program.
 */
public class Menu {
	
	//Initialize an ArrayList to store all enemies created.
	public ArrayList<Horde> entities = new ArrayList<Horde>();
	
	/**
	 * This method represents the menu itself.
	 * It's an indefinite do-while loop that allows the user to move to other parts of the program.
	 * It also allows the user to quit.
	 * @throws FileNotFoundException 
	 */
	public void menuLoop () throws FileNotFoundException {
		
		//Establish the variable that will keep track of the user's choice. Also establish a Scanner to read the user's choice.
		int choice = 0;
		System.out.println("Welcome to the GoblinKing enemy-management system.");
		
		//Launch the Creator and Combat menus.
		Creator creator = new Creator();
		Combat combat = new Combat();
		
		//Launch the "menu" by enclosing the user in a do-while loop.
		do {
			System.out.println("Choose an action: \n 1: Create enemies. \n 2: Engage combat. \n 3: Query a list of recorded enemies. \n 4: Quit.");
			choice = 0;
			Scanner choicer = new Scanner(System.in);
			choice = choicer.nextInt();
			if (choice == 1) {
				choicer.close();
				creator.creatorLoop(entities);
			}
			if (choice == 2) {
				choicer.close();
				combat.combatLoop(entities);
			}
			if (choice == 3) {
				choicer.close();
				System.out.println("Current recorded enemies: \n----------");
				for (Horde e : entities) {
					e.valueReport();
					System.out.println("----------");
				}
			}
		} while (choice != 4);
		
	}

}
