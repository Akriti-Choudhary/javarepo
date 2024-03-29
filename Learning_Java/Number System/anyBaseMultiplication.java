import java.util.*;

public class anyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        while(n2 > 0)
        {
            int d = n2 % 10;
            n2 = n2/10;

            int sprd = getSingleDigitProduct(b , n1 , d);

            rv = getSum(b,rv ,sprd*p);
            p = p * 10;
        }
        return rv;
    }

    public static int getSingleDigitProduct(int b, int n1, int d2) {
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1 > 0 || c > 0)
        {
            int d1 = n1 %10;
            n1 = n1/10;
            int d = d1 * d2 + c;

            c = d / b;
            d = d % b;

            rv += d*p;
            p = p*10;
        }
        return rv;
    }

    public static int getSum(int b , int n1 , int n2)
    {
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n1 > 0 || n2 > 0 || c > 0)
        {
            int d1 = n1 % 10;
            int d2 = n2 % 10;

            n1 = n1/10;
            n2 = n2/10;

            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;

            rv += d * p;
            p = p * 10;

        }
        return rv;
    }
}