import java.util.Scanner;

public class bai1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = Integer.parseInt(sc.nextLine());
        while (T > 0) {
            long a, b, x = 1, y = 1;
            a = sc.nextInt();
            b = sc.nextInt();
            long gcdab = xGCD(a, b, x, y);
            System.out.println((a*b/gcdab) + " " + gcdab);
            T -= 1;
        }
    }

    public static long xGCD(long a, long b, long x, long y) {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }
        long x1 = 1, y1 = 1;
        long gcd = xGCD(b % a, a, x1, y1);
        x = y1 - (b / a) * x1;
        y = x1;
        return gcd;
    }
}
