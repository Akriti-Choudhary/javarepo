import java.util.*;

class findRectangle {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of the rectangle:");
        int l = sc.nextInt();
        System.out.println("Enter breadth of the rectangle:");
        int b = sc.nextInt();
        Rectangle rect = new Rectangle(l, b);

        System.out.println("Length = " + rect.length);
        System.out.println("Breadth = " + rect.breadth);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());

    }
}

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }
}