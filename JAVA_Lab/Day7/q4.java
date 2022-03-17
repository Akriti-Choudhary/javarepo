import java.util.*;
public class q4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        shape obj ;


        System.out.println("Enter the length and width of rectangle");
        int l = sc.nextInt();
        int w = sc.nextInt();
        rectangle obj1 = new rectangle(l,w);
        obj = obj1;
        obj.area();

        System.out.println("Enter the length and heigth of triangle");
         l = sc.nextInt();
         w = sc.nextInt();
        triangle obj2 = new triangle(l,w);
        obj=obj2;
        obj.area();
        


    }
}
class shape
{
    int dim1 , dim2;
    shape()
    {
        dim1 = 0;
        dim2 = 0;
    }
    public void area()
    {
        int are = 0;
        System.out.println("Area = "+are);
    }
}
class rectangle extends shape
{
    int len , wid;
    rectangle(int l , int b)
    {
        len = l;
        wid = b;
    }
    public void area()
    {
        int are = len * wid;
        System.out.println("Area of rectangle = "+are);
        
    }

}
class triangle extends shape
{
    int len , height;
    triangle(int l , int h)
    {
        super();
        len = l;
        height = h;
    }
    public void area()
    {
        int are = (int) (len * height * 0.5);
        System.out.println("Area of triangle = "+are);
        
    }

}
