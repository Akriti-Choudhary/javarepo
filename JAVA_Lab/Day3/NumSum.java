import java.util.*;

public class NumSum
{
	public static void main(String[] args)
	{
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int sum = 0;
		for(int i = 0 ; i <= n; ++i)
		{
			if(i % 3 == 0)
			{
				sum += i;
			}	
		}
		System.out.println("Sum = "+sum);
		
		
	} 
}