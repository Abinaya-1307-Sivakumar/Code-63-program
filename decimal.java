import java.util.*;
public class decimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        int i=0;
        while(n!=0){
            int rem=n%2;
            a[i++]=rem;
            n/=2;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}