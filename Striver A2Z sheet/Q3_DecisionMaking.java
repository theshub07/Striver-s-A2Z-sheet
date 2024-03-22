import java.util.Scanner;

public class Q3_DecisionMaking {
    public static String compareIfElse(int a, int b) {
        // Write your code here

        String result;

        if (a < b) {
            result = "smaller";
        }

        else if (a > b) {
            result = "greater";
        }

        else {
            result = "equal";
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = compareIfElse(a, b);
        System.out.println(result);
        sc.close();

    }
}