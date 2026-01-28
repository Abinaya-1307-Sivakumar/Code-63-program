import java.util.*;
public class maxelementmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int result=maximum(mat,n);
        System.out.println(result);
    }
    public static int maximum(int mat[][],int n){
        int max=mat[0][0];
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                }
            }
        }
        return max;
    }
}
