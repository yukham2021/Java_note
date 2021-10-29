package classandobject;

public class Rectangle {
int width;
int height;
String color;
int area() {
	int area=width*height;
	return area;
}
void displaycolor() {
	System.out.println("Color is"+color);
}
}
