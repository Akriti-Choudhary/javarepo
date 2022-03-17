import java.util.*;
class box{
    double length,height,width;
    double volume()
    {
        return (length*width*height);
    }
}

class demo
{
    public static void main(String[] args) 
    {
        box b=new box();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the box");
        System.out.println("Enter the length of the box");
        b.length=sc.nextDouble();
        System.out.println("Enter the width of the box");
        b.width=sc.nextDouble();
        System.out.println("Enter the height of the box");
        b.height=sc.nextDouble();
        System.out.println("Volume of the box is "+b.volume());
        sc.close();
    }
}