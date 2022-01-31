import java.util.*;
import java.lang.Math;

class Armstrong_Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int rem ;
		int p = n;
		int sum = 0;
		while(p != 0)
		{
			rem = p % 10;
			sum += Math.pow(rem,3);
			p = p/10; 
		}
		if(sum == n)
		{
			System.out.println("Armstrong number");
		}
		else
		System.out.println("Not an Armstrong number");
	}
}