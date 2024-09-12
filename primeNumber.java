package numberPrograms;

import java.util.Iterator;

public class primeNumber 
{
	public static void main(String[] args) 
	{
		int num=11;
		for (int i = 2; i <=num/2; i++) 
		{
			if (num%i==0) 
			{
				System.out.println("Not a Prime number");
				break;
			}
			if(i==num/2)
			{
				System.out.println("prime number");
			}
		}	
	}
}
