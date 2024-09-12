package numberPrograms;

public class happySad 
{
    public static void main(String[] args) 
    {
        int num = 19;
        int ans = num;
        ans = isHappySad(ans);
        
        if(ans == 1)
        {
            System.out.println("Happy number");
        }
        else
        {
            System.out.println("Sad number");
        }
    }
    
    public static int isHappySad(int n)
    {
        while(n != 1 && n != 4)
        {
            n = square(n);
        }
        return n;
    }
    
    public static int square(int n)
    {
        int dup = n;
        int sum = 0;
        while(dup > 0)
        {
            int rem = dup % 10;
            sum = sum + (rem * rem);
            dup /= 10;
        }
        return sum;
    }
}