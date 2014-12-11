import java.io.FileNotFoundException;
import java.util.*;
/**
 * This class is the Main Menu of the program.
 */
public class Menu {
	
	//Initialize a HashSet to store all types of hordes recorded for use in a session.
	public HashSet<Horde> entities = new HashSet<Horde>();
	
	/**
	 * This method represents the menu itself.
	 * It's an indefinite do-while loop that allows the user to move to other parts of the program.
	 * It also allows the user to quit.
	 * @throws FileNotFoundException 
	 */
	public void menuLoop () throws FileNotFoundException {
		
		//Establish the variable that will keep track of the user's choice. Also establish a Scanner to read the user's choice.
		int choice = 0;
		System.out.println("~GoblinKing Enemy-Horde-Management System~");
		
		//Launch the Creator and Combat menus.
		Creator creator = new Creator();
		Combat combat = new Combat();
		
		//Launch the "menu" by enclosing the user in a do-while loop.
		Scanner console = new Scanner(System.in);
		do {
			System.out.println("Choose an action: \n 1 - Create hordes. \n 2 - Engage combat. \n 3 - Query a list of recorded hordes. \n 4 - Clear all recorded hordes. \n 5 - Quit.");
			choice = 0;
			choice = console.nextInt();
			if (choice == 1) {
				creator.creatorLoop(console, entities);
			}
			if (choice == 2) {
				combat.combatLoop(console, entities);
			}
			if (choice == 3) {
				System.out.println("Current recorded hordes: \n----------");
				for (Horde e : entities) {
					e.valueReport();
					System.out.println("----------");
				}
			}
			if (choice ==4) {
				entities.clear();
				System.out.println("Record cleared.");
			}
		} while (choice != 5);
		
		//Quit.
		System.out.println("~GoblinKing Enemy-Horde-Management System~");
		console.close();
		
	}
	
}
