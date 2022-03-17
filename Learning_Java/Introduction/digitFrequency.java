import java.util.*;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num and digit:");
        int num = sc.nextInt();
        int digit = sc.nextInt();

        int count = fre(num, digit);

        System.out.println("digit frequency = " + count);

    }

    public static int fre(int num, int digit) {
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == digit) {
                count++;
            }
            num = num / 10;
        }

        return count;
    }
}
