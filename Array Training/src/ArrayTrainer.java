import java.util.*;

public class ArrayTrainer {
	
	public static void main(String[] args) {
		
		System.out.println("This is a sorted array of random doubles:");
		ArrayList<Double> myMess = new ArrayList<Double>();
		myMess.add(4.5);
		myMess.add(7.3);
		myMess.add(6.2);
		myMess.add(3.8);
		myMess.add(9.1);
		Collections.sort(myMess);
		for (double n : myMess) {
			System.out.println(n);
		}
		System.out.println("Now to shuffle that array a few times...");
		Collections.shuffle(myMess);
		for (double o : myMess) {
			System.out.println(o);
		}
		System.out.println("(again)");
		Collections.shuffle(myMess);
		for (double p : myMess) {
			System.out.println(p);
		}
		
		System.out.println("The next section swaps items in and out of stacks and queues:");
		Queue<String> myQueue = new LinkedList<String>();
		Stack<String> myStack = new Stack<String>();
		myQueue.add("First");
		myQueue.add("Second");
		myQueue.add("Third");
		myQueue.add("Fourth");
		myQueue.add("Fifth");
		while (!myQueue.isEmpty()) {
			System.out.println(myQueue.peek());
			myStack.push(myQueue.remove());
		}
		System.out.println("Reverse order achieved by transferring the items to a stack:");
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		
	}

}