package controlstatements;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.if\n2.ifelse\n3.elseifladder\n4.nestedif\n5.exit\n\nEnter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			int a=10;
			System.out.println("main method starts");
			if(a==10)
			{
				System.out.println("If block executed");
			}
			break;
		case 2:		
			System.out.println("welcome ");
		double marks=95.67;

		if(marks>=35)
		{
			System.out.println("pass in exam");
		}
		else 
		{
			System.out.println("fail in exam");		System.out.println("write again exam");

		}	break;
		case 3:
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
			break;
		case 4:
			int bankpin=1234;
			int bankbal=3000;
			int pin=1234;
			if(bankpin==pin)
			{
				int amount=3001;
				if(bankbal>=amount)
				{
					System.out.println("Transaction successfull");
					System.out.println("Available balance is:"+(bankbal-amount));
				}
				else 
				{
					System.out.println("your balance is below the withdraw amount");
					}
			}
		
			else {
				System.out.println("Invalid pin");
			}
			break;
		case 5:

			System.out.println("invalid choice");
			System.exit(0);
	
		}
	}
		}}
