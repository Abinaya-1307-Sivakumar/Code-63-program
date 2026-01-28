import java.util.*;
public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        convert(n);
    }
    static void convert(int n){
        int dec=0,base=1;
        while(n>0){
            int r=n%2;
            dec=dec+(r*base);
            base=base*2;
            n/=10;
        }
        System.out.println(dec);
    }
}
