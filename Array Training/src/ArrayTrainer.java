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
	public static void main(String[] args) {
		
		//Make an ArrayList.
		ArrayList <String> test = new ArrayList<String>();
		System.out.println("Printing ArrayList items.");
		
		//Add stuff.
		test.add("A");
		test.add("B");
		test.add("C");
		test.add("C");
		test.add("D");
		test.add("D");
		
		//Print.
		System.out.println("ArrayList Foreach:");
		for (String s : test) {
			System.out.println(s);
		}
		System.out.println("ArrayList Iterator:");
		Iterator <String> i = test.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		//Make a LinkedList.
		LinkedList <String> testTwo = new LinkedList<String>();
		
		//Add items a different way, using a string literal.
		String[] items = {"A", "B", "B", "C", "D"};
		for (String item : items) {
			testTwo.add(item);
		}
		
		//Print.
		System.out.println("LinkedList Foreach:");
		for (String t : testTwo) {
			System.out.println(t);
		}
		System.out.println("LinkedList Iterator:");
		Iterator <String> j = testTwo.iterator();
		while (j.hasNext()) {
			System.out.println(j.next());
		}
		
		//Make a HashSet and a TreeSet, to compare.
		HashSet <Integer> testHash = new HashSet<Integer>();
		TreeSet <Integer> testTree = new TreeSet<Integer>();
		
		//Add to both lists. The duplicates do nothing since these are sets and not lists.
		int[] numbers = {1, 289, 289, 300, 45, 567, 567};
		for (int num : numbers) {
			testHash.add(num);
			testTree.add(num);
		}
		
		//Print each type of set.
		System.out.println("HashSet(unordered):");
		for (int y : testHash) {
			System.out.println(y);
		}
		System.out.println("---");
		Iterator <Integer> k = testHash.iterator();
		while (k.hasNext()) {
			System.out.println(k.next());
		}
		
		//(TreeSet)
		System.out.println("TreeSet(ordered):");
		for (int z : testTree) {
			System.out.println(z);
		}
		System.out.println("---");
		Iterator <Integer> m = testTree.iterator();
		while (m.hasNext()) {
			System.out.println(m.next());
		}
		
		
	}
}