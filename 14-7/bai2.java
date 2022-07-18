import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal:");
        int decimal = sc.nextInt();
        System.out.println("Enter the end radix:");
        int endRadix = sc.nextInt();
        String result = convertToBase(decimal, endRadix);
        System.out.println(result);
    }   
    public static String convertToBase(int decimal, int endRadix) {
        StringBuilder sb = new StringBuilder("");
        do {
            int rem = decimal % endRadix;
            if ((rem <= 9) && (endRadix <= 36) && (endRadix >= 2)) {
                sb.append(Integer.toString(rem));
            } else if ((rem <= 35) && (endRadix <= 36) && (endRadix >= 2)) {
                sb.append((char) (rem + 55));
            } else {
                throw new IllegalArgumentException("\n\nThe output radix must be from 2 to 36.\n");
            }
            decimal /= endRadix;
        } while (decimal != 0);
        return reverseOrder(sb.toString());
    }
    public static String reverseOrder(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; i--) {    // executes each character in reverse order
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
