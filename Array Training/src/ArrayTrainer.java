/**
 * @author acaruso
 */
public class ArrayTrainer {
	static int num = 1;
	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		printer(10);
	}
	
	public static void printer (int sum) {
		
		//Do the thing:
		if (num <= sum) {
		System.out.println(num);
		num++;
		printer(sum);
		}
		
	}
}