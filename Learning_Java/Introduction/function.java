import java.util.*;
public class function {
    public static int fact(int x)
    {
        int num = 1;
        for(int i = 1; i <=x;i++)
        {
            num *=i;
        }
        return num;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r:");
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n-r);

        System.out.println(n+"P"+r+" = " +nfact/nmrfact);

    }
}
