package numberPrograms;

public class sqRoot 
{
	public static void main(String[] args) 
	{
//		int a=100;
//		double ans=Math.sqrt(a);
//		
//		System.out.println(ans);
		
		int a=100;
		for (int i = 1; i<a; i++) 
		{
			if (i*i==a) 
			{
				System.out.println(i);
				break;
			}
		}
	}
}
