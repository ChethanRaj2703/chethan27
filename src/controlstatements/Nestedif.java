package controlstatements;

public class Nestedif {
	public static void main(String[] args) {
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
	}

}
