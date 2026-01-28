import java.util.*;
public class power{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int p=sc.nextInt();
        int n=1;
        for(int i=1;i<=p;i++){
            n=n*b;
        }
        System.out.println(n);
    }
}