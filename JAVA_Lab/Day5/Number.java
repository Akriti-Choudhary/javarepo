import java.util.*;

public class Number {
    int n;
    int a[];

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        a = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        sc.close();
    }

    void swap() {
        int p1 = 0, p2 = 0, max = a[0], min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                p1 = i;
                max = a[i];
            }
            if (a[i] < min) {
                p2 = i;
                min = a[i];
            }
        }
        a[p1] = min;
        a[p2] = max;
    }

    void display() {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Number ob = new Number();
        ob.input();
        System.out.println("Before swapping");
        ob.display();
        ob.swap();
        System.out.println("After swapping");
        ob.display();
    }
}