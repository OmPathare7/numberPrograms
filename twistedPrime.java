package numberPrograms;

public class twistedPrime 
{
	public static void main(String[] args) 
	{
		int num=11;
		int dup=num;
		int rev=0;
		
		for (int i = 2; i <=num/2; i++) 
		{
			if (num%i==0) 
			{
				System.out.println("Not a prime number");
				break;
			}
			if(i==num/2)
			{
				System.out.println("It is a prime number");
				while(num>0)
				{
					int rem=num%10;
					rev=(rev*10)+rem;
					num/=10;
				}
				
				for (int j = 0; j <=rev/2; j++) 
				{
					if(rev%i==0)
					{
						System.out.println("Not a twisted prime");
						break;
					}
					if(j==num/2)
					{
						System.out.println("It's reverse is also prime, hence it is a twisted prime");
					}
				}
			}
		}	
		
	}
}
