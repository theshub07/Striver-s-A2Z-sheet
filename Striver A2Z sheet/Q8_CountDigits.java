public class Q8_CountDigits {
    public static int countDigits(int n) {
        String numStr = String.valueOf(n);

        int count = 0;

        for (int i = 0; i < numStr.length(); i++) {

            int digit = Character.getNumericValue(numStr.charAt(i));

            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;
    }
}
