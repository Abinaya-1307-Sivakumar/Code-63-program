import java.util.*;
public class diagonalstringpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        pattern(str);
    }
    static void pattern(String str){
        int len=str.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j||j==len-1-i){
                    System.out.print(str.charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
