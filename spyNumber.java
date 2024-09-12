package numberPrograms;

public class spyNumber 
{
	public static void main(String[] args) 
	{
		int n=21;
		int sum=0;
		int multiply=1;
		
		int i=n;
		
		while(i>0)
		{
			int rem=i%10;
			sum+=rem;
			multiply*=rem;
			i/=10;
		}
		if(sum==multiply)
		{
			System.out.println("Spy");
		}
		else
		{
			System.out.println("Not a spy");
		}
	}
}
