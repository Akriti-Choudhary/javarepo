
public class maxNum
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = a;
        if(max < b)
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }
        System.out.println("Maximum num = " +max);


    }
}