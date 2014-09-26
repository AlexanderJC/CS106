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
		
	}	
	public static void firstQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The first question is asked, and the user's answer is recorded. */
		System.out.println("You're under attack! Think fast, what is your first reaction? \n 1: Draw my weapons and charge! \n 2: Take stock of the situation. \n 3: Run for it! \n 4: Rally my allies.");
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
			necro++;
		}
	
		/* Now that the user has answered, the next question method is called and passed the user's adjusted values. */
		secondQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void secondQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The second question is asked, and the user's answer is recorded. */
		System.out.println("The enemy is approaching! What will your first attack be? \n 1: I start setting up traps, and slowly retreat, drawing the enemy in. \n 2: I fire every long-ranged weapon I've got! \n 3: I armor up, or cast defensive spells. \n 4: I'm still charging!");
		int secondAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (secondAnswer == 1) {
			engi+=2;
			thief++;
			ranger++;
			necro++;
		} else if (secondAnswer == 2) {
			engi++;
			ranger++;
		} else if (secondAnswer == 3) {
			guard+=2;
			ele++;
		} else {
			warr++;
		}
	
		/* The next question method is called and passed the user's current values. */
		thirdQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void thirdQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The third question is asked, and the user's answer is recorded. */
		System.out.println("They are upon you now, these barbarians, and the fight has begun in earnest. How exactly do you bring them down, in the thick of battle? \n 1: My weapon cleaves through their ranks! \n 2: I strike in bursts of aggression or with concentrated magic. \n 3: I fight with balance, using a wide variety of effects. \n 4: ");
		int thirdAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (thirdAnswer == 1) {
			
		} else if (thirdAnswer == 2) {
			
		} else if (thirdAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		fourthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void fourthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {

		/* The fourth question is asked, and the user's answer is recorded. */
		System.out.println("");
		int fourthAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (fourthAnswer == 1) {
			
		} else if (fourthAnswer == 2) {
			
		} else if (fourthAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		fifthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void fifthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The fifth question is asked, and the user's answer is recorded. */
		System.out.println("");
		int fifthAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (fifthAnswer == 1) {
			
		} else if (fifthAnswer == 2) {
			
		} else if (fifthAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		sixthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void sixthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The sixth question is asked, and the user's answer is recorded. */
		System.out.println("");
		int sixthAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if sixthAnswer == 1) {
			
		} else if (sixthAnswer == 2) {
			
		} else if (sixthAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		seventhQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void seventhQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The seventh question is asked, and the user's answer is recorded. */
		System.out.println("");
		int seventhAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (seventhAnswer == 1) {
			
		} else if (seventhAnswer == 2) {
			
		} else if (seventhAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		eighthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void eighthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The eighth question is asked, and the user's answer is recorded. */
		System.out.println("");
		int eighthAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (eighthAnswer == 1) {
			
		} else if (eighthAnswer == 2) {
			
		} else if (eighthAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		ninthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void ninthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The ninth question is asked, and the user's answer is recorded. */
		System.out.println("");
		int ninthAnswer = asker.nextInt();
		
		/* Based on the user's answer, categories are incremented. */
		if (ninthAnswer == 1) {
			
		} else if (ninthAnswer == 2) {
			
		} else if (ninthAnswer == 3) {
			
		} else {
			
		}
	
		/* The next question method is called and passed the user's current values. */
		tenthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void tenthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
	
		/* The tenth question is asked, and the user's answer is recorded. */
		System.out.println("");
		int tenthAnswer = asker.nextInt();
	
		/* Based on the user's answer, categories are incremented. */
		if (tenthAnswer == 1) {
		
		} else if (tenthAnswer == 2) {
		
		} else if (tenthAnswer == 3) {
		
		} else {
		
		}

		/* The next question method is called and passed the user's current values. */
		answeringMachine(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
	
	}
	public static void answeringMachine(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The program calculates which profession the user is most like, and tells them. */
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

}