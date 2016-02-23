import java.io.*;
import java.util.Scanner;
//above package should be imported to use the scanner class.
//all prime no between 1 to 100.
//logic : no x%y = 0 unless y = x or 1

public class pr100me
{
	public static void main(String []args)

	{
		System.out.println("Enter any number . \n"); 
		Scanner inputN = new Scanner(System.in);
		int i = inputN.nextInt();
		int j,k,l,m,n;
		
			for (j=1;j<i;j++)
			{
				k = j%2;
				l = j%3;
				m = j%5;
				n = j%7;
				if (j == 1 || j == 2 || j == 3 || j == 5 || j == 7)
				{
					System.out.print("\n"+j+" ");
				}
				else if (k!=0 && l!=0 && m!=0 && n!=0)
				{
					System.out.print("\n"+j+" ");
					//continue;
				}
				

			}

		
	}


}