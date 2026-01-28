import java.util.Scanner;
public class longestwords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        longest(str,len);
    }
    public static void longest(String str,int len){
        int count=0,max=0,large=0;
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                count++;
            }
            else{
                if(count>max){
                    max=count;
                    large=i-count;
                }
                count=0;
            }
        }
        if (count > max) {
            max = count;
            large = len - count;
        }
        for(int i=large;i<large+max;i++){
            System.out.print(str.charAt(i));
        }
    }
}
