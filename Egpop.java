package dynamic_array;

import java.util.Stack;

public class Egpop {

	public static void main(String[] args) {
		Stack <String>animals=new Stack<>();
		animals.push("Dog");
		animals.push("Horse");
		animals.push("Cat");
		System.out.println("Initial Stack:"+animals);
		String element=animals.pop();
		System.out.println("remove element"+element);
		System.out.println("Peek:"+animals.peek());
		//Search an element
		int position=animals.search("Horse");
		System.out.println("position of Horse:"+position);
	}

}
