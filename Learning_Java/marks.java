import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student :");
        int n = sc.nextInt();
        if (n > 90) {
            System.out.println("Excellent");
        } else if (n > 80) {
            System.out.println("Good");
        } else if (n > 70) {
            System.out.println("Fair");
        } else if (n > 60) {
            System.out.println("meets Expectation");
        } else {
            System.out.println("Below par");
        }
    }
}
