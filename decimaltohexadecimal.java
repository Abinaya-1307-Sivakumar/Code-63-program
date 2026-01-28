import java.util.*;
public class decimaltohexadecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char a[]=new char[100];
        int i=0,rem;
        while(n!=0){
            rem=n%16;
            if(rem<10)
            {
                a[i]=(char)(rem+'0');
            }
            else
                a[i]=(char)(rem-10+'A');
            n/=16;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}
