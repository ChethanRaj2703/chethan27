package controlstatements;

public class ElseifLadder {
	public static void main(String[] args) {
		System.out.println("welcome to traffic signal");
		char signal='g';
		if(signal=='r')
		{
			System.out.println("please stop!");
		}
		else if(signal=='y')
		{
			System.out.println("please get ready!");
		}
		else if(signal=='g')
		{
			System.out.println("please Goo!");
		}
		else
		{
			System.out.println("get lost!");
		}
	}

}
