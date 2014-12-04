import java.util.*;
/**
 * This is a
 */
public class Enemy {
	
	//Create the game's four statistical values, along with the entity's armor class and level scaler.
	private String name;
	private int strength;
	private int speed;
	private int wit;
	private int will;
	private int armorClass;
	private int scaleLevel;
	private int level;
	private boolean upped = false;
	
	/**
	 * Constructor for custom enemies that don't exist already.
	 * @param initName
	 * @param initStrength
	 * @param initSpeed
	 * @param initWit
	 * @param initWill
	 * @param initAC
	 * @param initScale
	 * The above parameters parallel the variables defined above, and represent the statistics of the enemy.
	 * Since this Constructor is for creating custom enemies, should the need arise, it asks for every possible parameter.
	 */
	public Enemy (String initName, int initStrength, int initSpeed, int initWit, int initWill, int initAC, int initScale) {
		
		//Bind the given values to variables.
		this.name = initName;
		this.strength = initStrength;
		this.speed = initSpeed;
		this.wit = initWit;
		this.will = initWill;
		this.armorClass = initAC;
		this.scaleLevel = initScale;
		this.level = initScale;
		
	}
	
	/**
	 * Constructor for enemies pulled from the input file, generally standard versions of a common entity.
	 * @param mobName		The name of the enemy you're looking for; whatever you want to make.
	 * @param scaledLevel	The level you want this instance of the enemy to be (which must be equal to or higher than its level scale).
	 */
	public Enemy (String mobName, int finalLevel) {
		
		//Find the information on the type of enemy the user wants.
		Scanner mobFind = new Scanner("src/input.txt");
		while (mobFind.hasNext()) {
			if (mobFind.next().equals(mobName)) {
				//This is what the user was looking for; bind the information to this object.
				this.name = mobName;
				this.strength = mobFind.nextInt();
				this.speed = mobFind.nextInt();
				this.wit = mobFind.nextInt();
				this.will = mobFind.nextInt();
				this.armorClass = mobFind.nextInt();
				this.scaleLevel = mobFind.nextInt();
			} else {
				//Not what the user was looking for; skip six tokens to get to the next name.
				mobFind.nextInt();
				mobFind.nextInt();
				mobFind.nextInt();
				mobFind.nextInt();
				mobFind.nextInt();
				mobFind.nextInt();
			}
		}
		mobFind.close();
		
		//Scale the enemy up to the desired level, if applicable.
		int levelDiff = 0;
		if (finalLevel > scaleLevel) {
			//In this case, the desired level is higher than the level scale, so the enemy's stats need to be scaled up.
			levelDiff = finalLevel - scaleLevel;
			for (int i = 0; i < levelDiff; i++) {
				this.strength++;
				this.speed++;
				this.wit++;
				this.will++;
				this.level = finalLevel;
				this.upped = true;
			}
		}
	}
	
	/**
	 * This is a method that reports a given enemy's stats to the user, in case they are needed for reference.
	 */
	public void valueReport () {
		
		//Send the user this entity's statistical values, detecting if the enemy's level was scaled.
		System.out.println("Stat values for " + name + ": ");
		if (upped) {
			System.out.println("Level (scaled from" + scaleLevel + "): " + level + ".");
		} else {
			System.out.println("Level: " + level + ".");
		}
		System.out.println("Strength: " + strength + ", Speed: " + speed + ", Wit: " + wit + ", Will: " + will + ".");
		System.out.println("Armor Class: " + armorClass + ".");
		
	}
}
