/*if a digit it present at i in the original number then i will be present at the position(digit) 
in the reverse number */
import java.util.*;
import java.lang.Math;

public class inverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int rem = 0;
        int newNum = 0;

        while (n > 0) {
            rem = n % 10;
            newNum += i * (int) Math.pow(10, rem-1);
            i++;
            n = n/10;
        }
        System.out.println(newNum);
    }
}
