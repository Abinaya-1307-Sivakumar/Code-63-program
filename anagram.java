import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int len1=str1.length();
        int len2=str2.length();
        if (len1 != len2) {
            System.out.println("-1");
            return;
        }
        str1=anagram(str1,len1);
        str2=anagram(str2,len2);
        if(str1.equals(str2))
            System.out.println("1");
        else
            System.out.println("-1 ");
    }
    static String anagram(String str,int len){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            sb.setCharAt(i, Character.toLowerCase(ch));
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(sb.charAt(i)>sb.charAt(j)){
                    char temp=sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }
        return sb.toString();
    }
}
