import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int N = 100000;
    boolean[] check = new boolean[N + 1];
    for (int i = 2; i <= N; i++) {
      check[i] = true;
    }
 
    for (int i = 2; i <= N; i++) {
      if (check[i] == true) {
        for (int j = 2 * i; j <= N; j += i) {
          check[j] = false;
        }
      }
    }
    for (int i = 2; i <= k; i++) {
      if (check[i] == true) {
        System.out.print(i + " ");
      }
    }
  }

}