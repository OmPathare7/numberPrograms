package numberPrograms;

import java.util.Scanner;

class armstrongNumber 
{

    public static void main(String[] args) 
    {

        int originalNum, digit, cubeSum = 0,num,count=0;
        
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        originalNum = num;
        int other=num;
        while (num!= 0)
        {
            num/=10;
            count++;
        }
        
        while(other!=0)
        {
        	digit=other%10;
        	cubeSum += Math.pow(digit, count);
            other /= 10;
        }

        if(cubeSum == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    }
}