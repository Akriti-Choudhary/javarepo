import java.util.*;

class Shape {
    int area;

    void showArea() {
        System.out.println("Area = " + area);
    }

}

class circle extends Shape {
    int r;

    circle(int radius) {
        r = radius;
        area = (int) (22 / 7.0) * r * r;

    }

}

class rectangle extends Shape {
    int length;
    int width;

    rectangle(int l, int b) {
        length = l;
        width = b;
        area = l * b;
    }

}

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width of the recatngle");
        int l = sc.nextInt();
        int b = sc.nextInt();

        rectangle ob1 = new rectangle(l, b);
        ob1.showArea();

        System.out.println("Enter radius of the circle");
        int r = sc.nextInt();
        circle ob2 = new circle(r);
        ob2.showArea();

    }
}
