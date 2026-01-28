import java.util.*;
public class substringfrequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();
        substring(str,sub);
    }
    static void substring(String str,String sub){
        str = str.toLowerCase();
        sub = sub.toLowerCase();
        int count=0;
        for(int i=0;i<=str.length()-sub.length();i++){
            if (str.substring(i, i + sub.length()).equals(sub)){
                count++;
            }
        }
        System.out.println(count);
    }
}