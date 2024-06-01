package inheritence;

class India
{
int a=5;
public void m1()
{
System.out.println("hello everyone");	
}
}

class Karnataka extends India
{
int b=9;
public void m2()
{
	System.out.println("welcome to karnataka");
}}

class Bengaluru extends Karnataka
{
int c=9;
public void m3() 
{
	System.out.println("welcome to bengaluru");}
}


public class MultiLevel {
	public static void main(String[] args) {
		Bengaluru b= new Bengaluru();
		System.out.println("a="+b.a);
		System.out.println("b="+b.b);
		System.out.println("c="+b.c);
		
		b.m1();
		b.m2();
		b.m3();

		
	}
	

}
