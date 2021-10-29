package dynamic_array;

import java.util.LinkedList;
import java.util.Queue;

public class EgQueue {

	public static void main(String[] args) {
		//Creating Queue using the linkedlist class
		Queue <Integer>numbers=new LinkedList<>();
		
		//offer element to the Queue
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue:"+numbers);
		//Access elements of the Queue
		int accessedNumber=numbers.peek();
		System.out.println("Access Element:"+accessedNumber);
		//remove elements from the Queue
		int removedNumber=numbers.poll();
		System.out.println("remove number:"+removedNumber);
		System.out.println("remaining numbers"+numbers);
		System.out.println("remove method"+numbers.remove());
		System.out.println(numbers);
	}

}
