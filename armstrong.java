import java.util.*;
public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n<0)
            n=-n;
        int temp=n;
        armstrongno(n,temp);
    }
    static void armstrongno(int n,int temp){
        int c=0,sum=0;
        int t=temp;
        while(n>0)
        {
            n/=10;
            c++;
        }
        while(temp>0){
            int rem=temp%10;
            int base=1;
            for(int i=1;i<=c;i++){
                base*=rem;
            }
            sum=sum+base;
            temp/=10;
        }
        if(t==sum)
            System.out.println("true");
        else
            System.out.println("false");
    }
}