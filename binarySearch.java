package numberPrograms;

import java.util.Arrays;
import java.util.Iterator;

public class binarySearch 
{
	public static void main(String[] args) 
	{
		int []a= {3,4,5,6,7,0,-23,-98,9,44,2,1};
		int temp;
		int num=44;
		
		for (int i = 0; i < a.length-1; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
