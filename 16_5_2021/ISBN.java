import java.util.*;
class ISBN{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ten digit code");
		int code = sc.nextInt();
		int num = code;
		int count = 0, rem = 0 ,sum = 0;
		
		while(num != 0){
			rem = num % 10;
			count++;
			num = num / 10;
		}
		if(count != 10){
			System.out.println("Illegal ISBN");
		}
		else{
			for(int i = 10 ;i >= 1; --i){
				rem = code % 10;
				sum = sum + (rem * i) ;
				code = code / 10;
			}
			if(sum % 11 == 0){
				System.out.println("Legal ISBN");
			}
			else{
				System.out.println("Ilegal ISBN");
			}
		}
	}
}
			
			
		

