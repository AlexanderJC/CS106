/**
 * @author Alexander Caruso <acaruso@skidmore.edu>
 * This program is for the use of NPC combat simulation.
 * It can create enemies and have them fight, keeping track of health.
 * The primary purpose of this program is to compute damage for large numbers of NPCs all at once.
 */
public class GoblinKing {
	/**
	 * This section leads to the Menu.
	 * @param args Arguments passed to the command line.
	 */
	public static void main(String[] args) {
		
		//Launch the menu.
		Menu menu = new Menu();
		menu.menuLoop();
		
	}

}
