import java.util.*;
public class printdiagmatrix{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        diagnol(n,matrix);
    }
    static void diagnol(int n,int matrix[][]){
        for(int i=0;i<n;i++){
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(matrix[i][n-1-i]+" ");
        }
    }
}