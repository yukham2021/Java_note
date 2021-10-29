package classandobject;

public class Car {
	int modelYear;
	String modelName;
	
public Car(int year,String name) {
	modelYear=year;
	modelName=name;
}
public Car(String name){
	modelName=name;
}
public static void main(String []args) {
	Car myCar1=new Car(1990,"Toyota");
	Car myCar2=new Car("Toyota");
	System.out.println(myCar1.modelYear+""+myCar1.modelName);
	System.out.println(myCar2.modelName);
}

}
