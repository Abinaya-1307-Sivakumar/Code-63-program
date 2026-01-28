import java.util.*;
public class count{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n==0)
            count=1;
        if(n<0)
            n=-n;
        while(n>0)
        {
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}