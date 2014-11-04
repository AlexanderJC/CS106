import java.io.*;

/**
 * This program will allow the user to gain a variety of information about their Guild Wars 2 character.
 * @author Alexander Caruso <acaruso@skidmore.edu>
 */
public class BuildFocusCalculator {

	/**
	 * Master method.
	 * Given a text document which describes the player's equipment, this method will analyze the player character.
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Create a new character: make an "empty character", and fill it out with the user's stats.
		Character player = new Character();
		player.load("src/input.txt");
		player.recordStats();
		
		//Analyze the created character, and tell the user the results.
		player.balance();
		
	}

}
