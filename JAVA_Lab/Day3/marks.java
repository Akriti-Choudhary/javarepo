import java.util.*;
import java.lang.Math;

class marks
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		System.out.println("Enter 5 elements in the array: ");
		for(int i = 0 ; i < 5; ++i)
		{
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for(int i = 0 ; i < 5; ++i)
		{
			sum += arr[i];
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Max = " +max +"\n"+ "Average = " + sum/4);
	}
}