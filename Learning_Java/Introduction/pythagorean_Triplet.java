import java.util.*;

public class pythagorean_Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        if (max == a) {
            boolean flag = (b * b + c * c == a * a) ? true : false;
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = (a * a + c * c == b * b) ? true : false;
            System.out.println(flag);
        } else {
            boolean flag = (b * b + a * a == c * c) ? true : false;
            System.out.println(flag);
        }
    }
}
