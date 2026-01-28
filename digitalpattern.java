import java.util.*;
public class digitalpattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int temp=i;
            int add=n;
            while(add>=i){
                System.out.print(temp+" ");
                temp+=add;
                add--;
            }
            System.out.println();
        }
    }
}