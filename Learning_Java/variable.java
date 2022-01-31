public class variable {
    public static void main(String[] args)
    {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum of "+x+" and "+y+" is " +sum);

        //x*y
        System.out.println("Product of "+x+" and "+y+" is "+ x*y);

        //x/y ,y/x and x%y
        System.out.println("x/y of "+x+" and "+y+" is "+ x/y);
        System.out.println("y/x of "+x+" and "+y+" is "+ y/x);
        System.out.println("x%y "+x+" and "+y+" is "+ x%y);
        
        //expression
        int exp = (x * y)/(x + y);
        System.out.println("Result = " + exp);


    }
}
