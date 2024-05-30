package sgtintern;

public class MethodOverloading {
	public void m1(String a) {
		System.out.println(" Hello every one welcome to "+a);
	}
	public void m1(int a,String b) {
		System.out.println(a+".session is core java by :" +b);
	}
	public void m1(double a ,double b) {
		System.out.println(" task1 is to add to double values :"+(a+b));
	}
	public void m1(int x, int y ,int z) {
		System.out.println(" task2 is to add 3 integer values :"+(x+y+z));
	}
	public void m1() {
		System.out.println("run run!");
	}

	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.m1();
mo.m1("Shree gajanan technologies");
mo.m1(1,"Rukshadnya");
mo.m1(1.2, 2.3);
mo.m1(1,10, 100);
}}

