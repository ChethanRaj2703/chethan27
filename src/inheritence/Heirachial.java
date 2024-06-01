package inheritence;

class A
{
	int a=100;
public void m1()
{
System.out.println("hello");	
}
}
class B extends A
{
int b=200;
public void m2()
{
	System.out.println("hi");
	}
}
class C extends A
{
int c=300;
public void m3()
{
System.out.println("welcome");	
}
}
public class Heirachial {
	public static void main(String[] args) {
		A a= new A();
		System.out.println(a.a);
		a.m1();
		System.out.println();
		B b=new B();
		System.out.println(b.a);
	    b.m1();
	    System.out.println(b.b);
	    b.m2();
	    System.out.println();
	    C c=new C();
		System.out.println(c.a);
	    c.m1();
	    System.out.println(c.c);
	    c.m3();
	}

}
