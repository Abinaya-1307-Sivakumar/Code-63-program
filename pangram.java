import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        check(str);
    }
    static void check(String str){
        int len=str.length();
        int c=0;
        for(char ch='a';ch<='z';ch++){
            if((str.indexOf(ch)!=-1)||str.indexOf((char)(ch-32))!=-1)
                c++;
        }
        if(c==26)
            System.out.println("1");
        else
            System.out.println("-1");
    }
}
