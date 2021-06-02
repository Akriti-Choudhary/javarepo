import java.util.*;

class temperature{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature");
		int temp = sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("1 - convert from Farenheit to Celcius");
		System.out.println("2 - convert from Celcius to Farenheit");
		int ch = sc.nextInt();
		
		double res = 0;
		
		switch(ch){
		case 1 :	res = (5.0/9.0) * (temp - 32);
				System.out.println("Temperature in Celcius :" +res +" degree celcius");	
				break;
		case 2 :	res = ((9.0/5.0) * temp) + 32;
				System.out.println("Temperature in Farenheit :" +res +" degree Farenheit");	
				break;		
		default :	System.out.println("Wrong input");	
				break;		
		}
		
	}
}
