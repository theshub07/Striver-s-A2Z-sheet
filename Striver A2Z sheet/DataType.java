import java.util.Scanner;

public class DataType {
    public static int dataTypes(String dataType) {
        // Write your code here
        int result = 0;

        if (dataType.equals("Integer")) {

            result = 4;
        }

        else if (dataType.equals("Long")) {

            result = 8;
        }

        else if (dataType.equals("Float")) {

            result = 4;
        }

        else if (dataType.equals("Double")) {

            result = 8;
        }

        else if (dataType.equals("Character")) {

            result = 1;
        }

        return result;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the data type");
        String dataType = sc.nextLine();

        System.out.println(dataTypes(dataType));
    }

}