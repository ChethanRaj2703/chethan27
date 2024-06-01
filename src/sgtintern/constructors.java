package sgtintern;
class Hello
{
int x;
int y;
public Hello(int x, int y) {
	this.x = x;
	this.y = y;
}

}

public class constructors {
	public static void main(String[] args) {
		
		Hello h1= new Hello(10,20);
System.out.println("x="+h1.x);
System.out.println("y="+h1.y);

Hello h2= new Hello(100,200);
System.out.println("x="+h2.x);
System.out.println("y="+h2.y);
	
	}
}

/*class Hello
{
int x=10;
int y=20;
public Hello() {
      x = 100;
      y = 200;
}
}
public class constructors {
	public static void main(String[] args) {
		
		Hello h1= new Hello();
System.out.println("x="+h1.x);
System.out.println("y="+h1.y);

Hello h2= new Hello();
System.out.println("x="+h2.x);
System.out.println("y="+h2.y);
	
	}
}*/