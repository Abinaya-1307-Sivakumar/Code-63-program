import java.util.*;
public class removeextra {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int i=0,space=1;
        while(i<str.length()){
            if(str.charAt(i)!=' '&&str.charAt(i)!='\t'&&str.charAt(i)!='\n'){
                sb.append(str.charAt(i));
                space=0;
            }
            else if(space==0){
                sb.append(' ');
                space=1;
            }
            i++;
        }
        int len=sb.length();
        if(len>0&&sb.charAt(len-1)==' '){
            sb.deleteCharAt(len-1);
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
