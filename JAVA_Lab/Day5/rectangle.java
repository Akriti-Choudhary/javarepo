import java.util.*;

class cal {

    public static void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = sc.nextInt();
        System.out.println("Enter the width");
        int b = sc.nextInt();
        calculate(l, b);
    }

    public static void calculate(int l, int b) {
        int area = l * b;
        int peri = 2 * (l + b);
        display(area, peri);
    }

    public static void display(int area, int peri) {
        System.out.println("Area = " + area + "\nPerimeter = " + peri);
    }

}

public class rectangle {

    public static void main(String[] args) {
        cal ob = new cal();
        ob.read();
    }

}
