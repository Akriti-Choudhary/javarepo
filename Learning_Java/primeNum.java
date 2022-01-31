import java.util.*;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T != 0) {
            T--;
            int n = sc.nextInt();
            int count = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
                if (count > 1) {
                    System.out.println("not a prime");
                    break;
                }

            }
            if (count == 1) {
                System.out.println("prime");
            }
        }
    }
}
