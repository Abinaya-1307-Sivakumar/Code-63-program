import java.util.*;
public class longestpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        int len = str.length();
        if (str == null || len == 0) {
            System.out.println("");
            return;
        }

        int max = 1, start = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int left = i, right = j;
                boolean isPal = true;

                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        isPal = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPal && (j - i + 1) > max) {
                    start = i;
                    max = j - i + 1;
                }
            }
        }
        System.out.println(str.substring(start, start + max));
    }
}
