import java.util.*;

public class Patter {
    public static void main(String args[]) {

        int n, row = 0, col;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            col = 1;
            for (int j = 0; j < n; j++) {
                if (i == row && j == col) {
                    System.out.print(n - i + " ");
                    col += 1;

                } else {
                    System.out.print(n + " ");
                }

            }
            row += 1;
            System.out.println();
        }

    }

}
