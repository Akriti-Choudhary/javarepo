import java.util.Scanner;

public class area
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        System.out.println("c - to calculate area of circle");
        System.out.println("s - to calculate area of square");
        System.out.println("r - to calculate area of rectangle");
        char choice = in.next().charAt(0);
        
        switch(choice) {
            case 'c':
                System.out.println("Enter the radius of circle: ");
                double r = in.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;
                
            case 's':
                System.out.print("Enter the side of square: ");
                double side = in.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;
                
            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = in.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
    }
}