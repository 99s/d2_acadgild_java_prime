import java.io.*;
import java.util.Scanner;
//above package should be imported to use the scanner class.
//all prime no between 1 to 100.
//logic : no x%y = 0 unless y = x or 1

public class prime
{
	public static void main(String []args)

	{
		System.out.println("Enter any number between 1 and 100. \n"); 
		Scanner inputN = new Scanner(System.in);
		int i = inputN.nextInt();
		int j,k;//a,b ;
		/*for (a = 1 ; a < 101 ; a++)
		{
			for (b = 1; b < a ; b++)
			{
				if (a%b == 0)
				{
					System.out.println(a);
					continue;
				}
			}

		}*/
		if (i < 1 || i > 100)
		{
			System.out.println("\n Bro, Pay attention!\n");
		}
		else if (i == 1)
		{
			System.out.println("\n 1 is Prime....");
		}
		else
		{
			for (j=2;j<i;j++)
			{
				k = i%j;
				if (k == 0)
				{
					System.out.println(i +" is N0T! Prime;");
					break;
				}
				else
				{
					System.out.println(i + " Is Prime\n");
					break;
				}

			}

		}
	}


}