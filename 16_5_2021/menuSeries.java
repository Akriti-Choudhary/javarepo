import java.util.*;

class menuSeries{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your choice");
		System.out.println("1 - 0,3,8,15,24...");
		System.out.println("2 - 1/2 + 3/4 + 5/6+....19/20");
		int ch = sc.nextInt();
		
		
		double sum = 0;
		switch(ch){
		case 1 :	System.out.println("Enter the number");
				int num = sc.nextInt();
				for(int i = 1; i <= num; ++i){
					System.out.print(((i * i) - 1) +" ");
				}
				System.out.println(" ");	
				break;
		case 2 :	double count = 2;
				for(int i = 1; i <= 19; i = i + 2){
					sum = sum + (i / count);
					count = count + 2;
				}
				System.out.println(sum);		
				break;		
		default :	System.out.println("Wrong input");	
				break;		
		}
		
	}
	
			
}
