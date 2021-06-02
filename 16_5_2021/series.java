import java.util.*;

public class series{
	public static void main(String args[]){
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double s = 0, p = 1, div = 0;
		double total = 0;
		for(int i = 2; i <= n; ++i)
		{
			s = sum(i);
			p = product(i);
			div = s/p;
			total = total + div;
		}
		System.out.println("The sum of the series is " +total);
	}
	static int sum(int i){		
		int j ,tot = 0;
		for(j = 1; j <= i; ++j){
			tot = tot + j;
		}
		return tot;
	}
	

	static int product(int i){
		int j ,pro = 1;
		for(j = 1; j <= i; ++j){
			pro = pro * j;
		}
		return pro;
	}
}
