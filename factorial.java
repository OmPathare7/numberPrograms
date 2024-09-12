package numberPrograms;

//import java.math.BigInteger;

public class factorial 
{
	public static void main(String[] args) 
	{
		int n=9;
//		BigInteger factorial=BigInteger.ONE;
//		
//		for (int i = n; i >0; i--) 
//		{
//			factorial=factorial.multiply(BigInteger.valueOf(n));
//		}
//		System.out.println(factorial);
		
		int factorial=1;
		for (int i = n; i >0; i--) 
		{
			factorial*=i;
		}
		System.out.println(factorial);
	}
}
