/* Import the Scanner, because it's the backbone of the entire program. */
import java.util.*;
/**
 * @author Alexander Caruso acaruso@skidmore.edu
 */
public class HackProofProfessionQuiz {
	/**
	 * @param args I think this is something to do with establishing the command-line arguments one can use during a program. Not entirely sure.
	 * 
	 * This program will ask the user several questions, and then evaluate their personality based on their answers.
	 * It will then tell them which Guild Wars 2 profession they are most similar to.
	 * 
	 * In this first method, the variables for each profession are established, and the Scanner object that will be used for the duration of the program is created.
	 * That's all this method does before passing on all of that stuff to the "question methods".
	 * 
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
		} else
			System.out.println("You fought most like an Elementalist.");
		}
		
		/* At this point, the user has been given their answer, and the quiz is finished. */
		

	/**
	 * The following series of eight methods asks the user the questions in the quiz. 
	 * Each subsequent method is set up identically to this first one, and uses the same variables.
	 * The user's score for each applicable class is incremented and then passed on to the next question.
	 * 
	 * @param warr The user's score for Warrior.
	 * @param guard Their score for Guardian.
	 * @param thief Their score for Thief.
	 * @param ranger Their score for Ranger.
	 * @param engi Their score for Engineer.
	 * @param necro Their score for Necromancer.
	 * @param mes Their score for Mesmer.
	 * @param ele Their score for Elementalist.
	 * Java doesn't seem to think that the scholar professions in Guild Wars 2 actually exist. 
	 * Apparently, Java does NOT believe in offensive magic.
	 * 
	 * @param asker The Scanner object, which asks the user the questions.
	 * 
	 */
	public static void firstQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The first question is asked, and the user's answer is recorded. */
		System.out.println("You're under attack! Think fast, what is your first reaction? \n 1: Draw my weapons and charge! \n 2: Take stock of the situation. \n 3: Run for it! \n 4: Rally my allies.");
		int firstAnswer = 0;
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (firstAnswer <= 0 || firstAnswer > 4) {
			if (asker.hasNextInt()) {
				firstAnswer = asker.nextInt();
				if (firstAnswer <= 0 || firstAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}

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
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (secondAnswer <= 0 || secondAnswer > 4) {
			if (asker.hasNextInt()) {
				secondAnswer = asker.nextInt();
				if (secondAnswer <= 0 || secondAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
		
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
		System.out.println("They are upon you now, these barbarians, and the fight has begun in earnest. How exactly do you bring them down, in the thick of battle? \n 1: My weapon cleaves through their ranks! \n 2: I strike in bursts of aggression or with concentrated magic. \n 3: I fight with balance, using a wide variety of effects. \n 4: I stay mobile, skirmishing and steadily wearing down the enemy.");
		int thirdAnswer = asker.nextInt();
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (thirdAnswer <= 0 || thirdAnswer > 4) {
			if (asker.hasNextInt()) {
				thirdAnswer = asker.nextInt();
				if (thirdAnswer <= 0 || thirdAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
		
		/* Based on the user's answer, categories are incremented. */
		if (thirdAnswer == 1) {
			warr++;
			guard++;
			ranger++;
		} else if (thirdAnswer == 2) {
			necro++;
			mes+=2;
			ele++;
			thief+=2;
		} else if (thirdAnswer == 3) {
			ele+=2;
			engi++;
			guard++;
		} else {
			thief+=2;
			necro+=2;
		}
	
		/* The next question method is called and passed the user's current values. */
		fourthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void fourthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {

		/* The fourth question is asked, and the user's answer is recorded. */
		System.out.println("As the battle rages on, you have killed several of their number. How do you feel? \n 1: I'm only concerned for my allies and myself. \n 2: Their death-screams only fuel the bloodrage in my heart! \n 3: I feel remorse. I want to demoralize them and continue on my way, if I can, instead of killing them all. \n 4: I'm concerned that they'll send reinforcements.");
		int fourthAnswer = asker.nextInt();
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (fourthAnswer <= 0 || fourthAnswer > 4) {
			if (asker.hasNextInt()) {
				fourthAnswer = asker.nextInt();
				if (fourthAnswer <= 0 || fourthAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
		
		/* Based on the user's answer, categories are incremented. */
		if (fourthAnswer == 1) {
			guard++;
			engi++;
			mes++;
			necro++;
		} else if (fourthAnswer == 2) {
			warr++;
			thief+=2;
			necro+=2;
		} else if (fourthAnswer == 3) {
			guard++;
			ranger+=2;
			ele++;
			engi+=2;
		} else {
			ranger+=2;
			thief++;
		}
	
		/* The next question method is called and passed the user's current values. */
		fifthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void fifthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The fifth question is asked, and the user's answer is recorded. */
		System.out.println("You've thinned their number, and their chieftan strides through the fray to face you. She flashes you a wicked smile. What's going on in your head? \n 1: I'm checking her weapons and armor. \n 2: I'm ready to fight, and I face her, on guard. \n 3: I consider retreat. Open confrontation is risky. \n 4: I watch the others. I can beat one, but not many at once.");
		int fifthAnswer = asker.nextInt();
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (fifthAnswer <= 0 || fifthAnswer > 4) {
			if (asker.hasNextInt()) {
				fifthAnswer = asker.nextInt();
				if (fifthAnswer <= 0 || fifthAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
		
		/* Based on the user's answer, categories are incremented. */
		if (fifthAnswer == 1) {
			necro+=2;
			thief+=2;
			ele+=2;
			guard++;
			engi+=2;
		} else if (fifthAnswer == 2) {
			warr++;
			ranger+=2;
			necro++;
			guard+=3;
		} else if (fifthAnswer == 3) {
			mes+=2;
			thief++;
			engi++;
		} else {
			thief+=2;
			mes++;
			ranger++;
		}
	
		/* The next question method is called and passed the user's current values. */
		sixthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void sixthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The sixth question is asked, and the user's answer is recorded. */
		System.out.println("The chieftan lashes out with a vicious blow to your side. How do you defend yourself? \n 1: I use protection magic and armor to withstand the attack. \n 2: I parry! \n 3: I dodge out of the way, ready to heal myself if I take further damage. \n 4: I back away, and attack from range.");
		int sixthAnswer = asker.nextInt();
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (sixthAnswer <= 0 || sixthAnswer > 4) {
			if (asker.hasNextInt()) {
				sixthAnswer = asker.nextInt();
				if (sixthAnswer <= 0 || sixthAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
		
		/* Based on the user's answer, categories are incremented. */
		if (sixthAnswer == 1) {
			guard+=3;
			warr+=2;
			necro++;
			engi++;
		} else if (sixthAnswer == 2) {
			ranger+=2;
			warr++;
			thief+=3;
			mes++;
		} else if (sixthAnswer == 3) {
			thief+=2;
			ele+=2;
			necro++;
		} else {
			ranger++;
			engi+=3;
		}
	
		/* The next question method is called and passed the user's current values. */
		seventhQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void seventhQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
		
		/* The seventh question is asked, and the user's answer is recorded. */
		System.out.println("After her attack, the chieftan is vulnerable. You must choose how to bring her down. \n 1: With a single, mighty blow! \n 2: With a barrage of rapid attacks! \n 3: With a crippling wound or debilitating magic! \n 4: As long as I stay on my feet, she will fall eventually.");
		int seventhAnswer = asker.nextInt();
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (seventhAnswer <= 0 || seventhAnswer > 4) {
			if (asker.hasNextInt()) {
				seventhAnswer = asker.nextInt();
				if (seventhAnswer <= 0 || seventhAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
		
		/* Based on the user's answer, categories are incremented. */
		if (seventhAnswer == 1) {
			warr++;
			ele+=2;
			thief+=3;
			guard+=2;
		} else if (seventhAnswer == 2) {
			engi+=3;
			mes+=2;
			ele++;
		} else if (seventhAnswer == 3) {
			necro+=3;
			ranger+=2;
			thief++;
		} else {
			guard+=2;
			ele+=2;
			mes++;
			necro+=2;
		}
	
		/* The next question method is called and passed the user's current values. */
		eighthQuest(warr, guard, thief, ranger, engi, necro, mes, ele, asker);
		
	}
	public static void eighthQuest(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele, Scanner asker) {
	
		/* The tenth question is asked, and the user's answer is recorded. */
		System.out.println("She is slain! The remaining barbarians scatter at the sight of their fallen chieftan. What now? \n 1: Time to loot the body! \n 2: Time to check for wounds and recover what resources I can, in case I am ambushed again. \n 3: Time to celebrate! My allies and I start a roaring fire. \n 4: I contemplate the fight. What can I learn?");
		int eighthAnswer = asker.nextInt();
		
		/* Check if the user gave valid input, and, if not, ask for input again. */
		while (eighthAnswer <= 0 || eighthAnswer > 4) {
			if (asker.hasNextInt()) {
				eighthAnswer = asker.nextInt();
				if (eighthAnswer <= 0 || eighthAnswer > 4) {
					System.out.println("Invalid input; you have entered an invalid integer.");
				}
			} else {
				System.out.println("Invalid input; you have entered a non-integer.");
				asker.next();
			}
		}
	
		/* Based on the user's answer, categories are incremented. */
		if (eighthAnswer == 1) {
			necro++;
			warr+=2;
			thief+=3;
			ele++;
			engi+=2;
		} else if (eighthAnswer == 2) {
			ranger+=3;
			guard+=3;
			mes++;
		} else if (eighthAnswer == 3) {
			warr+=2;
			guard+=2;
			ele++;
			necro+=3;
		} else {
			guard++;
			ele+=2;
			engi++;
			ranger+=2;
		}

		/* The next question method is called and passed the user's current values. */
		answeringMachine(warr, guard, thief, ranger, engi, necro, mes, ele);
	
	}
	/**
	 * This final method takes the user's fully-incremented scores and determines which class they have the most points in.
	 * It also displays their scores for each individual class, so the user can see which classes they were more or less similar to.
	 * 
	 * @param warr The user's score for Warrior.
	 * @param guard Their score for Guardian.
	 * @param thief Their score for Thief.
	 * @param ranger Their score for Ranger.
	 * @param engi Their score for Engineer.
	 * @param necro Their score for Necromancer.
	 * @param mes Their score for Mesmer.
	 * @param ele Their score for Elementalist.
	 * 
	 */
	public static void answeringMachine(int warr, int guard, int thief, int ranger, int engi, int necro, int mes, int ele) {
		
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
		} else if (ele > warr && ele > guard && ele > thief && ele > ranger && ele > engi && ele > necro && ele > mes) {
			System.out.println("You fought most like an Elementalist.");
		} else {
			System.out.println("You fought with versatility and wisdom! Any class suits you.");
		}
		System.out.println("Warrior score: " + warr + ".");
		System.out.println("Guardian score: " + guard + ".");
		System.out.println("Thief score: " + thief + ".");
		System.out.println("Ranger score: " + ranger + ".");
		System.out.println("Engineer score: " + engi + ".");
		System.out.println("Necromancer score: " + necro + ".");
		System.out.println("Mesmer score: " + mes + ".");
		System.out.println("Elementalist score: " + ele + ".");
		/* At this point, the user has been given their answer, and the quiz is finished. */
		
	}
	
}
