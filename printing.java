import java.util.*;
public class printing{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        count(n);
    }
    static void count(int n)
    {
        int base=1;
        int temp=n;
        while(n>0)
        {
            temp/=10;
            base*=10;
        }
        base/=10;
        while(base>0)
        {
            int rem=n/base;
            System.out.println(rem);
            n%=base;
            base/=10;
        }
    }
}
