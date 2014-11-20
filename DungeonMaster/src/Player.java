/**
 * This is a 
 */
public class Player {
	
	//Create the game's four statistical values.
	private String name;
	private int strength;
	private int speed;
	private int wit;
	private int will;
	
	/**
	 * Constructor.
	 * @param initName
	 * @param initStrength
	 * @param initSpeed
	 * @param initWit
	 * @param initWill
	 * The above are the initial values for the base statistics, representing the current statistical levels of the entity the user is creating.
	 */
	public Player (String initName, int initStrength, int initSpeed, int initWit, int initWill) {
		
		///Bind the given values to variables.
		this.name = initName;
		this.strength = initStrength;
		this.speed = initSpeed;
		this.wit = initWit;
		this.will = initWill;
		
	}
	
	/**
	 * This is a
	 */
	public void valueReport () {
		
		//Send the user this entity's statistical values.
		System.out.println("Current statistical values for " + name + ": \n" + "Strength: " + strength + ", Speed: " + speed + ", Wit: " + wit + ", Will: " + will + ". \n");
		
	}
}