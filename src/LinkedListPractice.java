import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class LinkedListPractice {
	public static final int maxSize = 100;
	public static void main(String[] args) {
		LinkedList<Integer> temp = new LinkedList<Integer>();
		populate(temp);
		System.out.println(temp.toString());
		interviewQuestion(temp);
	}
	private static void interviewQuestion(LinkedList<Integer> temp) {
		//Sort
		Object temp2 = temp.clone();
		Collections.sort(temp);
		System.out.println(temp);
	}
	private static void populate(LinkedList<Integer> temp) {
		Random rm = new Random();
		int size = Math.abs(rm.nextInt() % maxSize);
		System.out.println("Size = " + size);
		for (int i=0;i<size;i++) {
			int e = rm.nextInt() % maxSize;
			temp.add(e);
		}
		System.out.println("Unsorted");
		Iterator<Integer> i1 = temp.iterator();
		while(i1.hasNext()){
			System.out.print(i1.next() + ", ");
		}
		System.out.println();
	}
}
