import java.util.*;
/**
 * This class is the Combat menu. It represents an instance of combat within the game.
 * It rolls initiative, keeps track of health, and allows for the addition and subtraction of enemies.
 */
public class Combat {
	
	//Establish a list to add selected hordes to. This is used to shuffle the hordes and create an initiative order.
	private ArrayList<Horde> forces = new ArrayList<Horde>();
	private Queue<Horde> initiative = new LinkedList<Horde>();
	
	/**
	 * The main Combat loop.
	 * @param console		The Scanner used to read user input in this program.
	 * @param entities		The list of enemy type that the user can use to make hordes.
	 * @return The menu returns a meaningless integer so that it doesn't pile itself up on the stack.
	 */
	public int combatLoop (Scanner console, HashSet<Horde> entities) {
		
		//Establish a variable to record the number of players in this combat.
		forces.clear();
		initiative.clear();
		
		//Ask the user to indicate the number of players involved in this combat.
		System.out.println("Entered Combat. \n");
		
		//Show the user what types of hordes they can put in this combat.
		System.out.println(" Current recorded hordes: \n----------");
		for (Horde e : entities) {
			e.valueReport();
			System.out.println("----------");
		}
		System.out.println("\n");
		
		//Run the horde-adding menu.
		hordeAdd(console, entities);
		
		//Shuffle the forces ArrayList and add its elements to the Queue, initiative. This represents the turn order for combat.
		int combatantsCount = 0;
		boolean isAlive = true;
		int decreaseCount = 0;
		Collections.shuffle(forces);
		for (Horde a : forces) {
			initiative.add(a);
			combatantsCount++;
		}
		
		//Begin combat proper by looping through the initiative Queue over and over until all the enemies are dead.
		System.out.println("\n ~Combat Engaged~");
		do {
			//Combat starts with the players, so tell the user to have the players proceed through their own initiative order first.
			System.out.println("\n *** Players' turn. Enter anything to continue when ready. \n");
			console.next();
			
			//Begin the large enemy combat loop.
			System.out.println("\n Enemy actions begin. \n ");
			for (int i = 0; i < combatantsCount; i++) {
				int action = 0;
				Horde currentHorde = initiative.peek();
				String currentName = currentHorde.getName();
				int thisHordeSize = currentHorde.getSize();
				System.out.println("\n *** " + currentName + " horde numbering " + thisHordeSize + " attempts to attack!");
				System.out.println(" Individuals in this horde currently have " + currentHorde.getHealth() + " health.");
				do {
					System.out.println("Choose an action for this " + currentName + " horde: \n 1 - Attack and roll for damage. \n 2 - Sustain damage. \n 3 - Remove one or more members of this horde from combat. \n 4 - Increase or decrease this horde's Attack Interference index. \n 5 - Finish this horde's turn.");
					action = console.nextInt();
					if (action == 1) {
						//Attack!  Go to the fighting menu to roll for damage.
						fighting(console, currentHorde);
					}
					if (action == 2) {
						//Ask the user how much to damage the horde's members, and tell the user if the horde died from that damage.
						System.out.println("How much damage do the individuals in this horde sustain?");
						currentHorde.takeDamage(console.nextInt());
						int deathCheck = currentHorde.getHealth();
						if (deathCheck < 1) {
							System.out.println("Horde has sustained lethal damage! \n This " + currentName + " horde of " + thisHordeSize + " individuals has been defeated.");
							isAlive = false;
							action = 5;
							decreaseCount++;
						} else {
							System.out.println("Individuals in this horde now have " + currentHorde.getHealth() + " health.");
						}
					}
					if (action == 3) {
						//Allow the user to just remove some or all of the enemies in the horde.
						System.out.println("How many of the " + thisHordeSize + " individuals in this horde do you want to remove?");
						int losses = currentHorde.getSize();
						losses -= console.nextInt();
						currentHorde.setSize(losses);
						thisHordeSize = currentHorde.getSize();
						System.out.println(" This horde now contains " + thisHordeSize + " individuals.");
						if (thisHordeSize <= 0) {
							System.out.println(" Removed from combat.");
							isAlive = false;
							action = 5;
							decreaseCount++;
						}
					}
					if (action == 4) {
						//If the horde is in some way inhibited from attacking, the user can use this option to inhibit the horde's chance to hit and damage using the Attack Interference index.
						System.out.println("Current Attack Interference index for this horde is " + currentHorde.getAI() + ".");
						System.out.println(" Enter the new Attack Interference index: ");
						currentHorde.setAI(console.nextInt());
						System.out.println(" Changed.");
					}
				} while (action != 5);
				//Return this horde to the back of the initiative order if it didn't die, or get obliterated by the user or something.
				initiative.remove();
				if (isAlive){
					initiative.add(currentHorde);
				} else {
					isAlive = true;
				}
			}
			
			//If a horde died this combat, reduce the number of times that the program cycles through the enemy menu.
			if (decreaseCount > 0) {
				for (int i = 0; i < decreaseCount; i++) {
					combatantsCount--;
				}
				decreaseCount = 0;
			}
		//End the combat loop when the initiative Queue is empty (when all the enemies are dead).
		} while (!initiative.isEmpty());
		
		//Combat ended; return to main menu.
		System.out.println("\n ~Combat Concluded~ \n");
		return 9;
		
	}
	
	/**
	 * This is a sub-menu used to turn enemy types into hordes of various numbers.
	 * @param console		The Scanner used to read user input in this program.
	 * @param entities		The list of enemy type that the user can use to make hordes.
	 */
	public void hordeAdd (Scanner console, HashSet<Horde> entities) {
		
		//Establish a choice marker, and a boolean flag for use in the loop.
		int hordeAction = 0;
		boolean added = false;
		System.out.println("Add one or more hordes to this combat.");
		
		//Allow the user to add hordes, setting their size and adding them to the forces ArrayList.
		do {
			System.out.println("Choose an action: \n 1 - Add a horde. \n 2 - Finish adding hordes and roll for initiative.");
			added = false;
			hordeAction = 0;
			hordeAction = console.nextInt();
			if (hordeAction == 1) {
				System.out.println("Enter the name of the desired enemy type: ");
				String desiredType = console.next();
				//Search the list of entities for the user's choice.
				for (Horde h : entities) {
					//If the choice is found, add it to the list. 
					//Because the entities list is a Set, this code won't add duplicates; the user can choose to add a horde again to do that.
					if (h.getName().equals(desiredType)) {
						forces.add(h);
						System.out.println("Enter the desired number of individuals in the horde: ");
						h.setSize(console.nextInt());
						added = true;
					}
				}
				if (added) {
					System.out.println("Horde added to combat.");
				} else {
					System.out.println("The desired horde type is not specified. Choose another type.");
				}
			}
		} while (hordeAction != 2);
		
	}
	
	/**
	 * This section of the Combat menu calculates damage for a given horde against any chosen number of players.
	 * @param console		The Scanner used to read user input in this program.
	 * @param currentHorde	The current horde of enemies that is attacking.
	 */
	public void fighting (Scanner console, Horde currentHorde) {
		
		//Create an array to represent a d6 die, an array to represent a d20 die, and an ArrayList to contain the players' Dodge values.
		ArrayList<Integer> sixSide = new ArrayList<Integer>();
		for (int s = 1; s < 7; s++) {
			sixSide.add(s);
		}
		ArrayList<Integer> twentySide = new ArrayList<Integer>();
		for (int t = 1; t < 21; t++) {
			twentySide.add(t);
		}
		ArrayList<Player> dodgers = new ArrayList<Player>();
		
		//Ask the user to enter damage parameters.
		System.out.println("Determine damage parameters for this horde.");
		System.out.println(" How many six-sided dice should this horde roll for these attacks?");
		int dieNum = console.nextInt();
		System.out.println(" How many targets does this horde have?");
		int targetNum = console.nextInt();
		System.out.println(" Enter Name and then enter Dodge value rolled for each player: ");
		for (int i = 0; i < targetNum; i++) {
			dodgers.add(new Player(console.next(), console.nextInt()));
			System.out.println(" Added.");
		}
		
		//Generate damage values based on the parameters.
		System.out.println("Damage from " + currentHorde.getSize() + " individuals: ");
		for (int i = 0; i < currentHorde.getSize(); i++) {
			//Have this member of the horde pick a target player at random, and compare Dodge values.
			Collections.shuffle(dodgers);
			Player currentVictim = dodgers.get(0);
			int currentDodge = currentVictim.getDodge();
			Collections.shuffle(twentySide);
			int currentHit = twentySide.get(0);
			currentHit += currentHorde.getSpe();
			currentHit -= currentHorde.getAI();
			//See if this member of the horde managed to hit the player they chose to attack, and if they did, calculate damage.
			if (currentHit > currentDodge) {
				int currentDamage = 0;
				for (int j = 0; j < dieNum; j++) {
					Collections.shuffle(sixSide);
					currentDamage += sixSide.get(0);
				}
				currentDamage += currentHorde.getStr();
				currentDamage -= currentHorde.getAI();
				System.out.println("* " + currentHorde.getName() + " attacks " + currentVictim.getName() + " for " + currentDamage + " damage!");
			} else {
				System.out.println("* " + currentHorde.getName() + " misses " + currentVictim.getName() + "!");
			}
		}
	}
	
}
