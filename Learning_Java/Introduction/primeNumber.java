import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; ++j) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("not prime");
                continue;
            }
            int count = 0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    if (count > 0) {
                        System.out.println("not prime");
                        break;
                    }
                }
            }
            if (count == 0) {
                System.out.println("prime");
            }
        }
    }
}
