import java.util.*;
public class reversestring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        special(len,str);
    }
    static void special(int len,String str){
        int j=0;
        char b[]=new char[100];
        for(int i=0;i<len;i++){
            if((str.charAt(i)>='a'&& str.charAt(i)<='z')||
            (str.charAt(i)>='A'&&str.charAt(i)<='Z')||
            (str.charAt(i)>='0'&&str.charAt(i)<='9')){
                b[j++]=str.charAt(i);
            }
        }
        for(int i=j-1;i>=0;i--){
            System.out.print(b[i]);
        }
    }
}
