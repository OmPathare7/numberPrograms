package numberPrograms;

public class specialNumber 
{
	public static void main(String[] args) 
	{
		int num=50;
		int dup=num;
		int sum=0;
		int product=1;
		
		while(dup>0)
		{
			int rem=dup%10;
			sum+=rem;
			product*=rem;
			dup/=10;
		}
		
		if (sum+product==num) 
		{
			System.out.println("Special number");
		}
		else
		{
			System.out.println("Not a special number");
		}
	}
}
