import java.util.*;
import java.io.*;

/**
 * @author Alexander Caruso
 */
public class BasicFileReader {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		// Declarations.
		Scanner input = new Scanner(new File("src/input.txt"));
		PrintStream output = new PrintStream(new File("src/output.txt"));
		String currentLine = new String();
		int accountNumber = 0;
		double checkingTotal = 0.0;
		double savingsTotal = 0.0;
		double creditTotal = 0.0;
		String secondToken = new String();
		String thirdToken = new String();
		double fourthToken = 0.0;

		// Reads a line, and sets it as the current "line".
		while (input.hasNextLine()) {
			currentLine = input.nextLine();
			Scanner inputReader = new Scanner(currentLine);
			boolean addValue = true;

			// Skipping the first bit, since it's always the date.
			inputReader.next();

			// Reading the second bit to determine which account we're talking about.
			secondToken = inputReader.next();
			if (secondToken.equals("Checking")) {
				accountNumber = 1;
			} else if (secondToken.equals("Savings")) {
				accountNumber = 2;
			} else if (secondToken.equals("Credit")) {
				inputReader.next();
				accountNumber = 3;
			}

			// Checking if the third bit is one of the opening balances; if so, records starting total accordingly.
			thirdToken = inputReader.next();
			if (thirdToken.equals("Opening")) {
				inputReader.next();

				// If the third bit isn't an opening balance, checks to see whether to add or subtract from a total.
			} else if (thirdToken.equals("Withdrawal")) {
				addValue = false;
			}

			// Now that the parameters have been set, adds or subtracts from the appropriate balance according to the fourth bit.
			fourthToken = inputReader.nextDouble();
			if (accountNumber == 1) {
				if (addValue == false) {
					checkingTotal -= fourthToken;
				} else {
				checkingTotal += fourthToken;
				}
			} else if (accountNumber == 2) {
				if (addValue == false) {
					savingsTotal -= fourthToken;
				} else {
				savingsTotal += fourthToken;
				}
			} else if (accountNumber == 3) {
				if (addValue == false) {
					creditTotal -= fourthToken;
				} else {
				creditTotal += fourthToken;
				}
			}

			// This is the tail end of the while loop.
			inputReader.close();
		}

		// After adding up all of the account values, prints them to the output file.
		output.println("Checking account total: " + checkingTotal + ".");
		output.println("Savings account total: " + savingsTotal + ".");
		output.println("Credit card account total: " + creditTotal + ".");

		// Closing the Scanner and PrintStream objects.
		input.close();
		output.close();
		

	}
}
