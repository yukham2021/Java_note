package dynamic_array;

import java.util.Stack;

public class EgStack {

	public static void main(String[] args) {
	Stack <String>st=new Stack<String>();
	st.push("AA");
	st.push("BB");
	st.push("CC");
	System.out.println("peek"+st.peek());
	System.out.println("Search AA:"+st.search("AA"));
	System.out.println("pop"+st.pop());
	System.out.println("pop"+st.pop());
	System.out.println("pop"+st.pop());
	
	}

}
