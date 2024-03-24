import java.util.*;

public class Q5_NthFibonacciNumber {

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n + 1];

        // if (n<1){
        // System.out.println(n);
        // return;
        // }

        if (n == 1) {
            System.out.println("1");

            return;
        }

        if (n == 2) {
            System.out.println("1");
            return;
        }

        else {
            a[1] = 1;
            a[2] = 1;

            for (int i = 3; i <= n; i++) {
                a[i] = a[i - 1] + a[i - 2];

            }

            System.out.println(a[n]);

        }

    }

}
