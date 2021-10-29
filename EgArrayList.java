package dynamic_array;
import java.util.ArrayList;
public class EgArrayList {

	public static void main(String[] args) {
		ArrayList <Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("get at position 2:"+list.get(2));
		list.remove(0);
		System.out.println("Display list:"+list);
		for (Integer i:list) {
			System.out.println("value of array list:"+i);}
			list.set(0, 11);
			System.out.println("Display List"+list);
			System.out.println(list.contains(11));
			System.out.println(list.get(0));
			
			
		
	}

}
