import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4_SwitchCase {

    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0; 
        switch (ch) {
            case 1:
                area = Math.PI * a[0] * a[0];
                break;

            case 2:
                area = a[0] * a[1];
                break;

            default:
                System.out.println("Invalid Input.");
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice(1,2):");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                double[] a1 = new double[1];
                System.out.println("Enter the radius:");
                a1[0] = sc.nextDouble();
                double result1 = areaSwitchCase(ch, a1);
                System.out.println(String.format("%.5f", result1));
                break;

            case 2:
                double[] a2 = new double[2];
                System.out.println("Enter the length:");
                a2[0] = sc.nextDouble();
                System.out.println("Enter the breadth:");
                a2[1] = sc.nextDouble();
                double result2 = areaSwitchCase(ch, a2);
                System.out.println(String.format("%.5f", result2));
                break;

            default:
                System.out.println("Invalid Input.");
        }
    }
}
