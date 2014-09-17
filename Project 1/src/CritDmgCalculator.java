/**
 * 
 */
/**
 * @author acaruso
 *
 */
import java.util.*;
public class CritDmgCalculator {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* First, set up base values for power, ferocity, and critical damage (dmgMultiplier). */
		
		System.out.println("This program calculates attack damage value based on power and ferocity,");
		System.out.println("assuming 100% critical strike chance.");
		
		/* Prompt user for their character's current stat values. */
		Scanner consolePower = new Scanner(System.in);
		System.out.println("Current power: ");
		double power = consolePower.nextDouble();
		
		Scanner consoleFerocity = new Scanner(System.in);
		System.out.println("Current ferocity: ");
		double ferocity = consoleFerocity.nextDouble();
		
		/* Calculate the damage multiplier (given base 150% critical damage), using given ferocity. */
		double dmgMultiplier = ((ferocity / 15) + 150) * .01;
		
		/* Call secondary calculating methods. */
		currentAttack(power, ferocity, dmgMultiplier);
		additionalPower(power, ferocity, dmgMultiplier);
		additionalFerocity(power, ferocity, dmgMultiplier);
		
		/* Now, tell the user their current damage, 
		 * and how much their damage will increase with more power or ferocity. */
		
		/* Display the resulting attack value, calculated in the currentDamage method. */
		double attack = currentAttack(power, ferocity, dmgMultiplier);
		System.out.println("Given " + power + " power and " + ferocity + " ferocity,");
		System.out.println("resulting attack value is: " + attack + ".");
		
		/* Display the resulting attack damage values if the player gets additional power or ferocity,
		 * calculated in the additionalPower and additionalFerocity methods. */
		double potentialPowerAttack = additionalPower(power, ferocity, dmgMultiplier);
		double potentialFerocityAttack = additionalFerocity(power, ferocity, dmgMultiplier);
		System.out.println("Ten additional points of power will yield " + potentialPowerAttack + " damage.");
		System.out.println("Ten additional points of ferocity will yield " + potentialFerocityAttack + " damage.");
	}
	public static double currentAttack(double power, double ferocity, double dmgMultiplier) {
				
		/* Calculate the attack damage, given the user's current stats. */
		double attack = power * dmgMultiplier;
		
		return attack;
	}
	public static double additionalPower(double power, double ferocity, double dmgMultiplier) {
		
		/* Calculate how much additional damage power will give the user, on top of current values. */
		double potentialPower = power + 10;
		double potentialPowerAttack = potentialPower * dmgMultiplier;
		
		return potentialPowerAttack;
	}
	public static double additionalFerocity(double power, double ferocity, double dmgMultiplier) {
		
		/* Calculate how much additional damage ferocity will give the user, on top of current values. */
		double potentialFerocity = ferocity + 10;
		double potentialDmgMultiplier = ((potentialFerocity / 15) + 150) * .01;
		double potentialFerocityAttack = power * potentialDmgMultiplier;
		
		return potentialFerocityAttack;
	}
}
