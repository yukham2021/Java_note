package dynamic_array;

import java.util.ArrayList;
import java.util.Collections;

public class Sortingofarrlist{

	public static void main(String[] args) {
	ArrayList <String>listofcountries=new ArrayList<String>();
	listofcountries.add("India");
	listofcountries.add("US");
	listofcountries.add("China");
	listofcountries.add("Denmark");
	System.out.println("Before Sorting"+listofcountries);
	for (String counter:listofcountries) {
		System.out.println(counter);
		}
	Collections.sort(listofcountries);
	System.out.println("After Sorting:"+listofcountries);
	
	}

}
