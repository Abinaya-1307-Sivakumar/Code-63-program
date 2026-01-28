import java.util.*;
public class consecutive{
    public static void main(String[] args){
        int count=1;
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder str=new StringBuilder(input); 
        int len=str.length();
        if(len>0&&str.charAt(len-1)=='\n')
            str.setCharAt(len-1,'\0');
        consec(input,count,len);
    }
    static void consec(String str,int count,int len){
        for(int i=0;i<str.length();i++){
            count=1;
            while(i<(len-1)&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            System.out.print(str.charAt(i)+""+count+"");
        }
    }
}