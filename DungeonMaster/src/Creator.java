import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 * This class is the Creator menu. Within it, the user can create and load hordes.
 * Hordes added in this way are added to the "entities" array, created in the main method.
 */
public class Creator {
	
	/**
	 * @param console	The Scanner, created in the main Menu.
	 * @param entities	The ArrayList that contains all loaded hordes.
	 * @return The menu returns a meaningless integer so that it doesn't pile itself up on the stack.
	 * @throws FileNotFoundException
	 */
	public int creatorLoop(Scanner console, HashSet<Horde> entities) throws FileNotFoundException {

		// Let the user know that they're in the creation menu now, and launch a Scanner so they can navigate.
		System.out.println("Entered Creator. \n Choose an action: \n 1 - Initialize an enemy type from the archives. \n 2 - Initialize a custom enemy type. \n 3 - Initialize a group of enemy types from a load file. \n 4 - Go back.");
		int selection = console.nextInt();

		// Start the loop.
		if (selection == 1) {
			System.out.println("Enter the name and desired level of the enemy type you wish to create: ");
			entities.add(new Horde(console.next(), console.nextInt()));
			System.out.println("Created.");
			return 9;

		} else if (selection == 2) {
			System.out.println("You have chosen to create a custom enemy type. \n Enter the desired name: ");
			String desiredName = console.next();
			System.out.println("Enter Strength, Speed, Wit, Will, and Level: ");
			entities.add(new Horde(desiredName, console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt(), console.nextInt()));
			System.out.println("Created.");
			return 9;

		} else if (selection == 3) {
			//Launch the method to add a group of items all at once.
			Creator.massHordes(console, entities);
			return 9;

		} else {
			//User wants to go back to the main menu.
			return 9;
		}
		
	}
	
	/**
	 * This section of the Creator menu allows the user to load up a large amount of enemy types all at once.
	 * @param console	The Scanner from the main Menu, which reads user input.
	 * @param entities	The ArrayList that contains all loaded hordes.
	 * @throws FileNotFoundException 
	 */
	public static void massHordes (Scanner console, HashSet<Horde> entities) throws FileNotFoundException {
		
		System.out.println("You have chosen to load a group of enemy types into the program. \n Enter the filename to load from: ");
		//Create a new Scanner to read the chosen file.
		String fileName = "src/" + console.next() + ".txt";
		Scanner massFind = new Scanner(new File(fileName));
		
		//Create a Horde object out of every line in the file, and add them all to the entities array.
		while (massFind.hasNext()) {
			String tempName = massFind.next();
			int tempStr = massFind.nextInt();
			int tempSpe = massFind.nextInt();
			int tempWit = massFind.nextInt();
			int tempWill = massFind.nextInt();
			massFind.nextInt();
			int tempLVL = massFind.nextInt();
			entities.add(new Horde(tempName, tempStr, tempSpe, tempWit, tempWill, tempLVL));
		}
		massFind.close();
		System.out.println("Loaded.");
		
	}
	
}
