import java.util.*;

public class Num
{
	public static void main(String[] args)
	{
		System.out.println("Enter three numbers :");
		Scanner sc = new Scanner(System.in);
		int a , b , c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max = a;
		if(max < b)
		{
			max = b;
		}
		
		if(max < c)
		{
			max = c;
		}				
		System.out.println("Largest Number = " + max);
	} 
}