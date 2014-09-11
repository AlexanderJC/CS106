/**
 * 
 */
/**
 * @author acaruso
 *
 */
public class CritDmgCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* Define the base stat values. */
		double power = 3000;
		double ferocity = 1500;
		
		/* Calculate the damage multiplier given ferocity. */
		double dmgMultiplier = ((ferocity / 15) + 150) * .01;
				
		/* Calculate the damage output given the multiplier. */
		double attack = power * dmgMultiplier;
		
		/* Display the resulting attack value. */
		System.out.println("Given " + power + " power and " + ferocity + " ferocity,");
		System.out.println("resulting attack value is: " + attack + ".");
		
		additionalStats(power, ferocity, dmgMultiplier);
	}
	public static void additionalStats(double power, double ferocity, double dmgMultiplier) {
		
		/* Calculate how much additional damage power will give the player, on top of current values. */
		double potentialPower = power + 10;
		double potentialPowerAttack = potentialPower * dmgMultiplier;
		
		/* Calculate how much additional damage ferocity will give the player, on top of current values. */
		double potentialFerocity = ferocity + 10;
		double potentialDmgMultiplier = ((potentialFerocity / 15) + 150) * .01;
		double potentialFerocityAttack = power * potentialDmgMultiplier;
		
		/* Determine which stat will give the player more damage, on top of current values. */
		System.out.println("Ten additional points of power will yield " + potentialPowerAttack + " damage.");
		System.out.println("Ten additional points of ferocity will yield " + potentialFerocityAttack + " damage.");
	}
}
