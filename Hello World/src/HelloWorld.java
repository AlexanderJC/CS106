/**
 * @author acaruso
 */
public class HelloWorld {
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		
		//Print returned total of values:
		System.out.println("Sum of numbers in range: " + summer(10) + ".");
		
	}
	
	public static int summer (int max) {

		//Recurse:
		if (max > 1) {
			return max + summer(max -= 1);
		} else {
			return 1;
		}
		
	}
}