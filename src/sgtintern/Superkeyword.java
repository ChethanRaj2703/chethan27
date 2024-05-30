package sgtintern;

class Bike{  
String color="Red"; 
public void bikecolor()
{
System.out.println("my bike color is:"+color);	
}
}  

class Car extends Bike
{
public void carcolor()
{
	System.out.println(super.color);
	System.out.println("my car color is:"+color);
	
}
}
class Superkeyword
{
	public static void main(String[] args) {
		Car c= new Car();
		c.bikecolor();
		c.carcolor();}}



