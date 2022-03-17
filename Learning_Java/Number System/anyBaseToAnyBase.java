import java.util.*;
public class anyBaseToAnyBase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        System.out.println("Enter the base of num");
        int b1 = sc.nextInt();
        System.out.println("Enter the base in which num is to be converted");
        int b2 = sc.nextInt();
        
        int val = ToDecimal(num, b1 , b2);
        System.out.println(val);
    }

    public static int ToDecimal(int num, int b1 , int b2) {

        int rv = 0;
        int p = 1;
        while(num > 0)
        {
            int dig = num % b2;
            num = num / b2;
            rv += dig * p;
            p = p * b1;
        }
        return rv;
    }

}
