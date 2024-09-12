package numberPrograms;

public class nivenNumber 
{
	public static void main(String[] args) 
	{
		int num=123;
		int dup=num;
		int sum=0;
		
		while(dup>0)
		{
			int rem=dup%10;
			sum+=rem;
			dup/=10;
		}
		
		if(num%sum==0)
		{
			System.out.println("Niven number");
		}
		else
		{
			System.out.println("Not a niven Number");
		}
	}
}
