package numberPrograms;

public class duckNumber 
{
	public static void main(String[] args) 
	{
		int num=123;
		while(num>0)
		{
			int rem=num%10;
			
			if (rem==0) 
			{
				System.out.println("It is duck number");
				break;
			}
			num/=10;
		}
		if (num==0) 
		{
			System.out.println("Not a duck Number");
		}
	}
}
