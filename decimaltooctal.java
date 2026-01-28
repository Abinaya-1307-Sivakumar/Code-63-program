import java.util.*;
public class decimaltooctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0){
            System.out.println("0");
            return;
        }
        int arr[]=new int[100];
        int rem,i=0;
        while(n!=0){
            rem=n%8;
            arr[i++]=rem;
            n/=8;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
    }
}
