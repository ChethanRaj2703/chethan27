package sgtintern;

class Father
{
public void trip()
{
System.out.println("lets go to kerala");	
}
public void buycar()
{
System.out.println("we purchase  toyota Innova crysta");	
}}

class Son extends Father
{
@Override
public void trip()
{
	System.out.println("No lets go to Goa");}
@Override
public void buycar()
{
System.out.println("No we buy toyota fortunner ");	
}}
public class Overriding {
	public static void main(String[] args) {
		Son s=new Son();
		s.trip();
		s.buycar();
	}

}
