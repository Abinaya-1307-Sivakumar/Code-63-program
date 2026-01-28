import java.util.*;
public class duplicate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int result=duplicate(n,a);
        if(result==0)
        {
            System.out.print("No duplicate");
        }
    }
    public static int duplicate(int n,int a[])
    {
        int found=0;
        for(int i=0;i<n;i++)
        {
            int isduplicate=0;
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    isduplicate=1;
                    break;
                }
            }
            if(isduplicate==1)
            {
                int alreadyprinted=0;
                for(int k=0;k<i;k++)
                {
                    if(a[k]==a[i]){
                        alreadyprinted=1;
                        break;
                    }
                }
                if(alreadyprinted==0)
                {
                    System.out.print(a[i]+" ");
                    found=1;
                }
            }
        }
        return found;
    }
}