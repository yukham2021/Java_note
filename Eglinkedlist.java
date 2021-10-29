package dynamic_array;

import java.util.LinkedList;

public class Eglinkedlist {

	public static void main(String[] args) {
		LinkedList<String> name=new LinkedList<String>();
		name.add("MyaMya");
		name.add("SuSu");
		name.add("MyoMyo");
		name.add("ThuThu");
		System.out.println("Display LinkedList:"+name);
		for (int i=0;i<name.size();i++) {
			System.out.println("Using index of get():"+name.get(i));
		}
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		name.add(2,"AungAung");
		System.out.println("Add element of given index:"+name);
		System.out.println("Remove First"+name.removeFirst());
		System.out.println("After removing:"+name);
		System.out.println(name.remove(0));
		boolean flag=name.contains("susu");
		if (flag==true) {
			System.out.println("value contain in the Linklist");
			
		}else {System.out.println("value does not contain in the linklist");
		}
		boolean f=name.isEmpty();
		System.out.println(f);
		name.clear();
		System.out.println("After Clear:"+name);
	}

}
