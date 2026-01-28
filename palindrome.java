import java.util.*;
public class palindrome{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        if(temp==sum)
        {
            System.out.println("1");
        }
        else
            
        System.out.println("-1");
    }
}