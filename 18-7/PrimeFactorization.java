import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
    static int firstPrime = 2;
    static int firstIndexOfList = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputVariable = scanner.nextInt();
        int divisor = firstPrime;

        List<Integer> listPrimeFactor = new ArrayList<Integer>();
        while (divisor <= inputVariable) {
            if (inputVariable % divisor == 0) {
                inputVariable = inputVariable / divisor;
                listPrimeFactor.add(divisor);
            } else {
                divisor ++;
            }
        }

        System.out.println(listPrimeFactor);

        scanner.close();
    }    
}
