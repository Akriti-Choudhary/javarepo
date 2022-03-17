import java.util.*;
import java.lang.Math;

public class digitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int tmp = n;
        int count = 0;
        while (tmp > 0) {
            count++;
            tmp = tmp / 10;
        }
        int div = (int) Math.pow(10, count - 1);

        while (div != 0) {
            System.out.println(n / div);
            n = n % div;
            div = div / 10;
        }

        System.out.println();
    }

}
