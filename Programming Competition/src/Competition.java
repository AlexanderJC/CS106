import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Competition {

	public static void main(String[] args) {
		
		int dataNum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number of data sets?");
		dataNum = input.nextInt();
		
		double[] data = new double[dataNum];
		double[] answers = new double[dataNum];
		
		for (int i = 0; i < dataNum; i++) {
			System.out.println("Enter input: ");
			data[i] = input.nextDouble();
		}
		int counter = 0;
		for (double c : data) {
			double currentAns = 0.00;
			currentAns = (c * .8);
			BigDecimal bd = new BigDecimal(currentAns).setScale(2, RoundingMode.HALF_EVEN);
			currentAns = bd.doubleValue();
			String currentString = Double.toString(currentAns);
			String currentAddString = null;
			if (!(currentString.length() == 5)) {
				currentAddString = currentString + "0";
				System.out.println("$" + currentAddString);
			} else {
				System.out.println("$" + currentString);
			}
			counter++;
		}
		
	}
		
}

