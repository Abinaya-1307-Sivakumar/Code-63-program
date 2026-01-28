import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=-1,n2=1,ans;
        for(int i=1;i<=n;i++){
            ans=n1+n2;
            n1=n2;
            n2=ans;
            System.out.print(ans+" ");
        }
    }
}