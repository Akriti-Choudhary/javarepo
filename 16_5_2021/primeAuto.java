import java.util.*;

class primeAuto{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("1 - check for prime number");
		System.out.println("2 - check for automorphic number");
		int ch = sc.nextInt();
		
		double res = 0;
		
		switch(ch){
		case 1 :	res = prime(num);
				if(res == 1)
				System.out.println("Prime number");
				else
				System.out.println("Not a Prime number");	
				break;
		case 2 :	res = auto(num);
				if(res == 1)
				System.out.println("Automorphic number");
				else
				System.out.println("Not an Automorphic number");		
				break;		
		default :	System.out.println("Wrong input");	
				break;		
		}
		
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
	public static int auto(int num){
		int square = num * num;
		int temp = num , rem = 0 ,count = 0;
		int power ;
		while(temp !=0){
			rem = temp % 10;
			count++;
			temp = temp / 10;
		}
		power = (int)Math.pow(10,count);
		
		if((square % power) == num)
			return 1;
		else
			return 0;
	}
			
}
