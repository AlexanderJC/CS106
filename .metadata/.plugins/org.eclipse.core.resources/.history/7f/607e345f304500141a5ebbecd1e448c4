/* Import the Scanner. */
import java.util.Scanner;
/**
 * @author Alexander Caruso acaruso@skidmore.edu
 */
public class ProfessionQuiz {
	/**
	 * @param args
	 * 
	 * This program will ask the user several questions, and then evaluate their personality based on their answers.
	 * It will then tell them which Guild Wars 2 profession they are most similar to.
	 */
	public static void main(String[] args) {
		
		/* Declaration of variables for each possible result in the quiz: */
		int warr = 0;
		int guard = 0;
		int thief = 0;
		int ranger = 0;
		int engi = 0;
		int necro = 0;
		int mes = 0;
		int ele = 0;
		
		/* Creation of the scanner used to capture the user's answers. */
		Scanner asker = new Scanner(System.in);
		
		/* The first question is called, and passed each of the variables defined above. */
		firstQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
		/* The user will now be asked a series of questions, detailing a combat sequence,
		   and then the program will tell them which profession they "fought" most like. */
		// TODO: This is for the last method of the program, so move it once that's made!
		if (warr > guard && warr > thief && warr > ranger && warr > engi && warr > necro && warr > mes && warr > ele) {
			System.out.println("You fought most like a Warrior.");
		} else if (guard > warr && guard > thief && guard > ranger && guard > necro && guard > mes && guard > ele) {
			System.out.println("You fought most like a Guardian.");
		} else if (thief > warr && thief > guard && thief > ranger && thief > engi && thief > necro && thief > mes && thief > ele) {
			System.out.println("You fought most like a Thief.");
		} else if (ranger > warr && ranger > guard && ranger > thief && ranger > engi && ranger > necro && ranger > mes && ranger > ele) {
			System.out.println("You fought most like a Ranger.");
		} else if (engi > warr && engi > guard && engi > thief && engi > ranger && engi > necro && engi > mes && engi > ele) {
			System.out.println("You fought most like an Engineer.");
		} else if (necro > warr && necro > guard && necro > thief && necro > ranger && necro > engi && necro > mes && necro > ele) {
			System.out.println("You fought most like a Necromancer.");
		} else if (mes > warr && mes > guard && mes > thief && mes > ranger && mes > engi && mes > necro && mes > ele) {
			System.out.println("You fought most like a Mesmer.");
		} else {
			System.out.println("You fought most like an Elementalist.");
		}

		/* At this point, the user has been given their answer, and the quiz is finished. */
		
	}	
	public static void firstQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The first question is asked, and the user's answer is recorded. */
		System.out.println("You're under attack!  Think fast, what is your first reaction? \n 1: Draw my weapons and charge! \n 2: Take stock of the situation. \n 3: Run for it! \n 4: Rally my allies.");
		int firstAnswer = asker.nextInt();
		
		/* Based on the user's answer, certain categories are incremented. */
		if (firstAnswer == 1) {
			warr+=2;
		} else if (firstAnswer == 2) {
			guard++;
			thief++;
			ranger++;
		} else if (firstAnswer == 3) {
			thief++;
			mes++;
		} else {
			guard+=2;
			ele++;
		}
	
		/* Now that the user has answered, the next question method is called and passed the user's adjusted values. */
		secondQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void secondQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The second question is asked, and the user's answer is recorded. */
		System.out.println("");
		int secondAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (secondAnswer == 1) {
			
		} else if (secondAnswer == 2) {
			
		} else if (secondAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		thirdQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	// TODO: Make the rest of the questions!
		
		
	}
