import java.util.*;

class Emirp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int res1 = 0 , res2 = 0;
		int rev;
		res1 = prime(num);
		rev = reverse(num);
		res2 = prime(rev);
				if((res1 == 1) && (res2 == 1))
				System.out.println("Emirp number");
				else
				System.out.println("Not an Emirp number");	
				
		
	}
	public static int reverse(int num){
		int temp = num;
		int rem = 0 ,rev = 0;
		while(temp != 0){
			rem = temp % 10;
			rev = rev*10 + rem;
			temp = temp / 10;
		}
		return rev;
	}
	public static int prime(int num){
		int count = 0;
		for(int i = 1 ; i <= num ; ++i){
			if(num % i == 0)
				count++;
				}
		if(count == 2)
			return 1;
		else 
			return 0;
	}
	
			
}
