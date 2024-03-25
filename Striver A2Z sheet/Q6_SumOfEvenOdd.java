import java.util.Scanner;

public class Q6_SumOfEvenOdd{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit;
        int even = 0, odd = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit % 2 != 0)
                odd = odd + digit;
            else
                even = even + digit;
        }
        System.out.print(even + " " + odd);
    }
}