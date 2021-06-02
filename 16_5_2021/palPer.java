import java.util.*;

class palPer{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("1 - check for palindrome number");
		System.out.println("2 - check for perfect number");
		int ch = sc.nextInt();
		
		double res = 0;
		
		switch(ch){
		case 1 :	res = palindrome(num);
				if(res == 1)
				System.out.println("Palindrome number");
				else
				System.out.println("Not a Palindrome number");	
				break;
		case 2 :	res = perfect(num);
				if(res == 1)
				System.out.println("Perfect number");
				else
				System.out.println("Not a Perfect number");		
				break;		
		default :	System.out.println("Wrong input");	
				break;		
		}
		
	}
	public static int palindrome(int num){
		int temp = num;
		int rem = 0 ,rev = 0;
		while(temp != 0){
			rem = temp % 10;
			rev = rev*10 + rem;
			temp = temp / 10;
		}
		if(rev == num)
			return 1;
		else 
			return 0;
	}
	public static int perfect(int num){
		int sum = 0;
		for(int i = 1; i < num ; ++i){
			if(num % i == 0){
				sum = sum + i;
			}
		}
		if(sum == num)
			return 1;
		else
			return 0;
	}
			
}
