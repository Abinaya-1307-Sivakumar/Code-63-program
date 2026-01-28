import java.util.*;
public class diagonalsumofmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        sumofmatrix(mat,n);
    }
    public static void sumofmatrix(int mat[][],int n){
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            sum1+=mat[i][i];
            sum2+=mat[i][n-i-1];
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
