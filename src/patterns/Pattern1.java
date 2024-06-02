package patterns;

import java.util.Scanner;
public class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number rows to be printed");
		int rows=sc.nextInt();
		int contents=rows;
		for(int row=1;row<=rows;row++)
		{
			for(int col=1;col<=contents;col++)
			{
				System.out.print("*");

			}
			System.out.println();
			contents--;
			}
		}
	}



/* *****
   ****
   ***
   **
   *  */
