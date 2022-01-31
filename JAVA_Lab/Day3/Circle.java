import java.lang.Math;
import java.util.*;
public class Circle
{
	public static void main(String[] args)
	{
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius :");
		r  = sc.nextDouble();
		double peri = 2 * Math.PI *Math.pow(r,2);
		double area = Math.PI *r *r;
		System.out.println("Perimeter = "+ peri + "\n" + "Area = " +area);

	}
}