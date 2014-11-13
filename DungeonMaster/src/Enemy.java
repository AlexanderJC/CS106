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
	
	public void valueReport () {
		super.valueReport();
	}
}
