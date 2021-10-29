package dynamic_array;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList animals=new LinkedList();
		animals.add("Elephant");
		animals.add("Tiger");
		System.out.println("The list is:"+animals);
		animals.add("Lion");
		//printing the new list
		System.out.println("The new list is:"+animals);

	}

}
