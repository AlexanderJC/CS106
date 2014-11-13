/**
 * This is a subclass of Entity that creates any enemies (NPCs).
 */
public class Enemy extends Entity {
	
	/**
	 * This method calls the superconstructor method.
	 */
	public Enemy (String initName, int initStrength, int initSpeed, int initWit, int initWill) {
		
		//Pass to superconstructor.
		super(initName, initStrength, initSpeed, initWit, initWill);
		
	}
	
	public void statChecker () {
		
		//Send the user this entity's statistical values.
		System.out.println("Current statistics for " + name + ": \n" + "Strength: " + strength + ", Speed: " + speed + ", Wit: " + wit + ", Will: " + will + ". \n");
		
	}
}