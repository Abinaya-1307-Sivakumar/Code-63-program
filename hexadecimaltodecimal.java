import java.util.*;
public class hexadecimaltodecimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String hex=sc.nextLine();
        convert(hex);
    }
    static void convert(String hex){
        int dec=0;
        int base=1;
        for(int i=hex.length()-1;i>=0;i--){
            char ch=hex.charAt(i);
            if(ch>='0'&&ch<='9'){
                dec+=(ch-'0')*base;
            }
            else if(ch>='A'&&ch<='F'){
                dec+=(ch-'A'+10)*base;
            }
            else if(ch>='a'&&ch<='f'){
                dec+=(ch-'a'+10)*base;
            }
            else{
                System.out.println(ch);
                return;
            }
            base*=16;
        }
        System.out.println(dec);
    }
}
