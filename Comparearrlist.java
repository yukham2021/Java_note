package dynamic_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparearrlist {

	public static void main(String[] args) {
	ArrayList <String>listOne=new ArrayList<>(Arrays.asList("a","b","c","d","f"));// TODO Auto-generated method stub
	ArrayList <String>listTwo=new ArrayList<>(Arrays.asList("a","b","c","d","e"));
	Collections.sort(listOne);
	Collections.sort(listTwo);
	boolean isEqual=listOne.equals(listTwo);
	System.out.println(isEqual);
	//Compare equals lists example
	ArrayList <String>listThree=new ArrayList<>(Arrays.asList("a","b","c","d","f"));
	boolean isEqual1=listOne.equals(listThree);
	System.out.println(isEqual1);
	}

}
