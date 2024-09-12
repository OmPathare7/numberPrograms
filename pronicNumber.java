package numberPrograms;

import java.util.Iterator;

public class pronicNumber 
{
	public static void main(String[] args) 
	{
		int num=11;
		int i;
		for ( i = 0; i <=num; i++) 
		{
			if(num==i*(i+1))
			{
				System.out.println("pronic");
				break;
			}
		}
		if(i>num)
		{
			System.out.println("Not pronic");
		}
		
	}
}
