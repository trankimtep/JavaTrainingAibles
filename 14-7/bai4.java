import java.util.Scanner;

public class bai4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("F(n) = " + fib(n));
        sc.close();
    }
    public static int fib(int n)
    {
        if (n <= 1) {
            return n;
        }
 
        int previousFib = 0, currentFib = 1;
        for (int i = 0; i < n - 1; i++)
        {
            int newFib = previousFib + currentFib;
            previousFib = currentFib;
            currentFib = newFib;
        } 
        return currentFib;
    } 
}
