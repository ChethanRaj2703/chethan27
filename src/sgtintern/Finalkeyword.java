package sgtintern;

class Demo
{
	 final int a=10 ;
	 
	 int b=20;
	final public void m1()
	{
		System.out.println("Shree gajanan technologies");
		//a=20; cannot re-assign values
		System.out.println(a);
		b=25;
		System.out.println(b);
	}

}
 final class Demo1
{
	/*@Override
	public void m1()
{
	System.out.println("you canot override");}
*/
}
 /*class Inherit extends Demo1 canot inherit becase class Demo1 is declared as final
 {
	 
 }*/
public class Finalkeyword {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
		System.out.println(d.a);
		System.out.println(d.b);
		Demo1 d1=new Demo1();
	}

}
