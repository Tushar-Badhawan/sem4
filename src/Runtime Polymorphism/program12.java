import java.util.*;
abstract class Shape {
abstract void rectangleArea(double length, double width);
abstract void squareArea(double side);
abstract void circleArea(double radius);
}
class Area extends Shape 
{
void rectangleArea(double length, double width) {
System.out.println("Rectangle Area: " + (length * width));
}
void squareArea(double side) {
System.out.println("Square Area: " + (side * side));
}
void circleArea(double radius) {
System.out.println("Circle Area: " + (3.14 * radius * radius));
}
}
class Program12
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter length of rectangle: ");
double length = sc.nextDouble();
System.out.print("Enter width of rectangle: ");
double width = sc.nextDouble();
System.out.print("Enter side of square: ");
double side = sc.nextDouble();
System.out.print("Enter radius of circle: ");
double radius = sc.nextDouble();
Area areaCalculator = new Area();
areaCalculator.rectangleArea(length, width);
areaCalculator.squareArea(side);
areaCalculator.circleArea(radius);
sc.close();
}
}
