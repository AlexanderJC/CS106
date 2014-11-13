/**
 * @author Alexander Caruso <acaruso@skidmore.edu>
 * This program is for the use of NPC combat simulation.
 * It can create enemies and player characters and have them fight, keeping track of health.
 * The primary purpose of this program is to compute damage for large numbers of NPCs all at once.
 */
public class GoblinKing {
	/**
	 * This section controls the actions of the program. 
	 * Here, things are created, and commanded to attack each other.
	 * @param args Arguments passed to the command line.
	 */
	public static void main(String[] args) {
		//TODO: Create a superclass that outlines statistics for both enemies and allies.
		//TODO: Create subclasses that represent player characters and various types of enemies, extending the super.
		//TODO: Somehow create an interface with which to have things fight each other.
		//TODO: Initiative with a queue?
		//TODO: Keep track of health?
		
		Enemy goblin = new Enemy("Goblin Raider", 3, 5, 0, 1);
		goblin.statChecker();
		goblin.statChecker();

	}

}