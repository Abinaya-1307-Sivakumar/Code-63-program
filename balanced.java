import java.util.*;
public class balanced
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        parantheses(count,str);
    }
    public static void parantheses(int count,String str)
    {
        int i=0;
        while(i<str.length())
        {
            char ch=str.charAt(i);
            if(ch=='(')
                count++;
            else if(ch==')')
            {
                count--;
                if(count<0)
                    break;
            }
            i++;
        }
        if(count==0)
        {
            System.out.println("Balanced");
        }
        else
            System.out.println("Not Balanced");
    }
}