import java.util.*;

public class anyBaseToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b = sc.nextInt();

        int val = ToDecimal(num, b);
        System.out.println(val);
    }

    public static int ToDecimal(int num, int b) {

        int rv = 0;
        int p = 1;
        while(num > 0)
        {
            int dig = num % 10;
            num = num / 10;
            rv += dig * p;
            p = p * b;
        }
        return rv;
    }

}
