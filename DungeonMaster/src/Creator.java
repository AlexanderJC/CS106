import java.io.FileNotFoundException;
import java.util.*;
/**
 * This class is the Creator menu. Within it, the user can create enemies.
 * Enemies created in this way are added to the "entities" array, created in the main method.
 */
public class Creator {
	
	/**
	 * 
	 * @return The menu returns a meaningless integer so that it doesn't pile itself up on the stack.
	 * @throws FileNotFoundException 
	 */
	public int creatorLoop (ArrayList<Enemy> entities) throws FileNotFoundException {
		
		//Let the user know that they're in the creation menu now, and launch a Scanner so they can navigate.
		System.out.println("Entered Creator. \n Choose an action: \n 1: Initialize an enemy from the archives. \n 2: Initialize a custom enemy. \n 3: Go back.");
		Scanner selector = new Scanner(System.in);
		int selection = selector.nextInt();
		
		//Start the loop.
		if (selection == 1) {
			System.out.println("Enter the name and desired level of the enemy you wish to create: ");
			entities.add(new Enemy(selector.next(), selector.nextInt()));
			System.out.println("Created.");
			selector.close();
			return 1;
			
		} else if (selection == 2) {
			System.out.println("You have chosen to create a custom enemy. \n Enter the desired name: ");
			String desiredName = selector.next();
			System.out.println("Enter Strength, Speed, Wit, Will, Armor Class, and Level: ");
			entities.add(new Enemy(desiredName, selector.nextInt(), selector.nextInt(), selector.nextInt(), selector.nextInt(), selector.nextInt(), selector.nextInt()));
			System.out.println("Created.");
			selector.close();
			return 1;
			
		} else {
			selector.close();
			return 1;
		}
	}
}