/**
 * This class represents a single piece of gear in Guild Wars 2.
 * It's used to create a record of a player's entire set of equipment, in the form of an array, in the Character class.
 * @author Alexander Caruso
 */
public class Gear {
	//Declare variables.
	public String slot;
	public String type;
	public int firstStat;
	public int secondStat;
	public int thirdStat;
		
	/**
	 * Constructor method.
	 * @param initSlot 			- The given gear slot.
	 * @param initType 			- The given stat combination type of the gear.
	 * @param initFirstStat 	- The amount of the first of the three stats that the gear grants.
	 * @param initSecondStat 	- The amount of the second stat granted by the gear.
	 * @param initThirdStat 	- The amount of the third stat granted by the gear.
	 */
	public Gear (String initSlot, String initType, int initFirstStat, int initSecondStat, int initThirdStat) {
			
		//Bind the input values to this instance of the class.
		this.slot = initSlot;
		this.type = initType;
		this.firstStat = initFirstStat;
		this.secondStat = initSecondStat;
		this.thirdStat = initThirdStat;
			
	}
	
}