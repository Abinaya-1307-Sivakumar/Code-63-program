import java.util.Scanner;
public class CustomCenterSpiral2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        printCustomSpiral(mat, n);
        sc.close();
    }
    public static void printCustomSpiral(int[][] mat, int n) {
        int cx = n / 2;
        int cy = n / 2;
        System.out.print(mat[cx][cy] + " ");
        for (int j = cy - 1; j >= 0; j--) {
            System.out.print(mat[cx][j] + " ");
        }
        for (int i = cx + 1; i < n; i++) {
            System.out.print(mat[i][0] + " ");
        }
        for (int j = 1; j < n; j++) {
            System.out.print(mat[n - 1][j] + " ");
        }
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(mat[i][n - 1] + " ");
        }
        for (int j = n - 2; j >= 0; j--) {
            System.out.print(mat[0][j] + " ");
        }
    }
}
