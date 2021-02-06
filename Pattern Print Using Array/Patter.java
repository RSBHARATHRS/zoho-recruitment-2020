import java.util.*;

public class Patter {

    public static int min(int i, int j) {
        if (i < j)
            return i;
        else
            return j;
    }

    public static void main(String args[]) {

        int n, num = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        System.out.println();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == num || j == num) {
                    arr[i][j] = n - min(i, j);
                    // col += 1;
                } else {
                    arr[i][j] = n;
                }

            }
            if (i >= 1)
                num += 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
