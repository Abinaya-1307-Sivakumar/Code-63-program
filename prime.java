import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n<0){
            n=-n;
        }
        int res=check(n);
        if(res==2){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
    static int check(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
