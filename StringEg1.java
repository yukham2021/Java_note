package string;

public class StringEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ac ded ca";
		int pos=s1.indexOf("d");
		
String n=new String("Yangon");
String n1="Mandalay";
System.out.println("I live in " +n);
System.out.println("He lives in " +n1);
//substring()
String n2="Java Class String Quiz";
String sub=n2.substring(5,8);
System.out.println(sub);
//length
System.out.println(n2.length());
//indexOf
String name="My name is KyawKyaw.";
System.out.println(name.indexOf("KyawKyaw"));
//Concatenation
System.out.println(name+n2);
System.out.println(name.concat(n2));
//to UpperCases()
System.out.println(name.compareTo(n2));
//with trim()
System.out.println(n2.trim()+"javatpoint");
//without trim()
System.out.println(n2+"javatpoint");
//String to char array
String name1="My name is SuSu";
char arr[]=name.toCharArray();
for (int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
	//char array to String
	char arr2[]= {'a','e','i','o','u'};
	String arr2st=new String(arr2);
	System.out.println(arr2st);
	//Str1.equals(str2)
String str1=new String("Apple");
String str2=new String("Apple");
System.out.println(str1.equals(str2));
//==
String str3=new String("Java");
String str4=str3;
if (str3==str4){
	System.out.println("they are equal");
	
	
}else {System.out.println("they are not equal");

}

	}

}}
