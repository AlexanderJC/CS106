import java.util.*;
import java.io.*;

/**
 * This object represents a player character in Guild Wars 2. It is an array of Gear objects.
 * @author Alexander Caruso
 */
public class Character {
	//Declare variables. The stats array has seven values in it because there are seven primary stats in Guild Wars 2.
	// The stat order will be Power, Precision, Ferocity, Toughness, Vitality, Healing Power, and lastly Condition Damage.
	private Gear[] gearSet;
	private double[] stats = new double[7];
	
	/**
	 * Built based on lecture 20 from cs106.kevinfodness.com.
	 * This method loads a file containing a set of gear into a created Character object.
	 * In pseudocode, this method "equips" the created "character".
	 * @param filepath - The input file to draw data from, with which the array gearSet will be filled out.
	 * @throws FileNotFoundException
	 */
	public void load (String filepath) throws FileNotFoundException {
		
		//Set the given file as the source file for this method.
		File file = new File(filepath);
		
		//Create an array of the proper size, considering the input file, to fill with Gear objects.
		this.gearSet = new Gear[this.lineCount(file)];
		
		//Begin filling out gearSet with Gear objects from the input file.
		Scanner fileReader = new Scanner(file);
		int i = 0;
		while (fileReader.hasNext()) {
			this.gearSet[i] = new Gear(fileReader.next(), fileReader.next(), fileReader.nextInt(), fileReader.nextInt(), fileReader.nextInt());
			i++;
		}
		
		//Close Scanner.
		fileReader.close();
		
	}
	
	/**
	 * This method counts the number of lines in the input file. It's called by the load method.
	 * @param file The gear set from the load method.
	 * @return The number of lines in the file (which is the number of pieces of gear).
	 * @throws FileNotFoundException
	 */
	public int lineCount (File file) throws FileNotFoundException {
		
		//Declare the integer that will count the number of lines.
		int numLines = 0;
		//Open a Scanner to read the number of lines in the input file.
		Scanner lineCounter = new Scanner(file);
		while (lineCounter.hasNextLine()) {
			numLines++;
			lineCounter.nextLine();
		}
		//Close Scanner and return the line count for the input file.
		lineCounter.close();
		return numLines;
		
	}
	
	/**
	 * This method parses the set of gear from the input file, distilling that information into raw stat boosts.
	 */
	public void recordStats () {
		
		/*
		Looping through the player's set of gear,
		this nested loop detects what combination of stats the given piece of gear has,
		and then records the three stat values on that piece of gear,
		placing the values into the stats array in their correct slots. 
		*/
		for (Gear c : gearSet) {
			if (c.type.equals("Berserker")) {
				stats[0] += c.firstStat;
				stats[1] += c.secondStat;
				stats[2] += c.thirdStat;
			}
			if (c.type.equals("Soldier")) {
				stats[0] += c.firstStat;
				stats[3] += c.secondStat;
				stats[4] += c.thirdStat;
			}
			if (c.type.equals("Captain")) {
				stats[1] += c.firstStat;
				stats[0] += c.secondStat;
				stats[3] += c.thirdStat;
			}
			if (c.type.equals("Valkyrie")) {
				stats[0] += c.firstStat;
				stats[2] += c.secondStat;
				stats[4] += c.thirdStat;
			}
			if (c.type.equals("Assassin")) {
				stats[1] += c.firstStat;
				stats[0] += c.secondStat;
				stats[2] += c.thirdStat;
			}
		}
		//This doesn't represent nearly all the possible stat combinations, but for the purposes of this prototype program, several fairly common combination types are included and used.
		
	}
	
	/**
	 * Using the stats array, which contains a record of the created character's various stats from gear, this method tells the user what percentage of those stats are offensive and defensive.
	 */
	public void balance () {
		
		//Accesses the stats array, and adds together all of the player's offensive stats.
		double offense = stats[0] + stats[1] + stats[2] + stats[6];
		
		//Accesses the stats array again to add together all of the player's defensive stats.
		double defense = stats[3] + stats[4] + stats[5];
		
		//Tell the player how much their build emphasizes offense and defense, respectively.
		double total = offense + defense;
		System.out.println("Your gear is weighted as follows:");
		System.out.println("Offense: " + ((offense / total) * 100) + "%.");
		System.out.println("Defense: " + ((defense / total) *100) + "%.");
		System.out.println(" ");
		
	}
	
}