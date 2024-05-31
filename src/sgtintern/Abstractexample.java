package sgtintern;

public class Abstractexample {
	public static void main(String[] args) {
		System.out.println("y="+A.y);
		A.print();
		
		B b= new B();
		b.display();
		b.view();
		b.sample();
		
	}

}
abstract class A
{
	public int x=10;
	public static int y=100;
	public static void print ()
	{
		System.out.println(" hello static method");
	}
	public void display()
	{
		System.out.println(" hello non static method");
	}
    abstract public void view();
    abstract public void sample();
}

 class B extends A
{
public void view()
{
System.out.println("implementation for view method");	
}
public void sample()
{
System.out.println("implementation for sample method");	
}
}