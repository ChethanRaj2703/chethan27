package sgtintern;

 interface Itr1
 {
	 int x=100;// data members are by default static and final
	 public void print();//methods are by default abstract and public
 }
 interface Itr2
 {
	 int y=200;
	 public void display();
 }
 


public class Interfaces implements Itr1,Itr2
{
	public static void main(String[] args) {
		System.out.println(Itr1.x);
		System.out.println(Itr2.y);
		Interfaces i=new Interfaces();
		i.print();
		i.display();
		
	}
	public void print()
	{
		System.out.println("print method implementation");
	}
	public void display()
	{
		System.out.println("display method implementation");
	}

}
