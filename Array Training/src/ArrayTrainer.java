import java.util.*;
import java.io.*;

/**
 * @author acaruso
 *
 */
public class ArrayTrainer {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Declarations.
		Scanner input = new Scanner(new File("src/input.txt"));
		int lineCounter = 0;
		int iterCount = 0;
		String currentLine = new String();
		String creditTracker = new String();
		String balanceTracker = new String();
		
		//Count the number of lines.
		while (input.hasNextLine()) {
			lineCounter++;
			input.nextLine();
		}
		//Close that first scanner, since it's at the end of the file now.
		
		//Declaring arrays, and a new Scanner at the start of the file.
		String[] dates = new String[lineCounter];
		String[] accounts = new String[lineCounter];
		String[] transactions = new String [lineCounter];
		double[] amounts = new double[lineCounter];
		
		//Second scanner.
		Scanner inputClone = new Scanner(new File("src/input.txt"));
		
		//Beginning of the loop. The goal here is to convert the input document into those four arrays.
		while (inputClone.hasNextLine()) {
			currentLine = inputClone.nextLine();
			Scanner inputReader = new Scanner(currentLine);
			//First will be the date.
			dates[iterCount] = inputReader.next();
			//Next, it'll be the account type. Have to check which kind since Credit Card is multiple words.
			creditTracker = inputReader.next();
			if (creditTracker.equals("Credit")) {
				accounts[iterCount] = ("Credit Card");
				inputReader.next();
			} else {
				accounts[iterCount] = creditTracker;
			}
			//Third up is the transaction type. Again, need to check if it's Opening Balance first.
			balanceTracker = inputReader.next();
			if (balanceTracker.equals("Opening")) {
				transactions[iterCount] = ("Opening Balance");
				inputReader.next();
			} else {
				transactions[iterCount] = balanceTracker;
			}
			//Lastly, just have to record the double at the end. Then, advance the iteration counter.
			amounts[iterCount] = inputReader.nextDouble();
			iterCount++;
			//Tail end of this big loop.
			inputReader.close();
		}
		inputClone.close();
		
		//Moment of truth. 
		//Test an arbitrary member of one of the arrays here.
		System.out.println(accounts[3]);
		
		//Done!
		input.close();
		
	}

}
