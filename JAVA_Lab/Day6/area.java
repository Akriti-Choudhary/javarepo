import java.util.Scanner;

public class area {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle: ");
        double r = sc.nextDouble();
        double ca = Ar(r);
        System.out.println("Area of circle = " + ca);

        System.out.print("Enter the side of square: ");
        int side = sc.nextInt();
        int sa = Ar(side);
        System.out.println("Area of square = " + sa);

        System.out.print("Enter the base and height of triangle: ");
        int b = sc.nextInt();
        int h = sc.nextInt();
        double a = Ar(b, h);
        System.out.println("Area of triangle = " + a);

    }

    public static double Ar(double r) {
        double ca = (22 / 7.0) * r * r;
        return ca;

    }

    public static int Ar(int side) {
        int sa = side * side;
        return sa;

    }

    public static double Ar(int b, int h) {
        double sa = 0.5 * b * h;
        return sa;

    }

}
