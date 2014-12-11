import java.io.FileNotFoundException;
/**
 * @author Alexander Caruso <acaruso@skidmore.edu>
 * This program is an NPC combat simulator for tabletop roleplaying games, specifically for my D&D remake, Null.
 * It can create enemies and have them fight, keeping track of health.
 * The primary purpose of this program is to compute damage for large numbers of NPCs all at once.
 */
public class GoblinKing {
	
	/**
	 * This section leads to the Menu.
	 * @param args Arguments passed to the command line.
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Launch the menu.
		Menu menu = new Menu();
		menu.menuLoop();
		
	}
	
}
