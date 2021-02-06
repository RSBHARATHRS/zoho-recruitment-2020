import java.util.*;

public class SquarPatter {

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

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == num || j == num) {
                    System.out.print(n - min(i, j) + "  ");
                }
            }
            System.out.println();
            if (i >= 1)
                num += 1;
        }
    }
}
