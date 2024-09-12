package numberPrograms;

public class palindrome 
{
	public static void main(String[] args) 
	{	
		int num=0;
		int rev=0;
		int i=num;
		while(i>0)
		{
			rev=rev*10+(i%10);
			i/=10;
		}
		
		if (rev==num) 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
