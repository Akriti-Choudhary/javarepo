import java.util.Scanner;
	public class descending{
		public static void main(String[] args){ 
			int temp;
			Scanner sc = new Scanner(System.in);
			int arr[] = new int[20];

		    System.out.println("Enter the weights of 20 students:");

		    for (int i = 0; i < 20; i++) {
			arr[i] = sc.nextInt();
		    }
		    //Sorting begins
		    for (int i = 0; i < 20; i++) {
		        for (int j = i + 1; j < 20; j++) 
		        {
		            if (arr[i] < arr[j]) 
		            {
		                temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		            }
		        }
		    }
		    System.out.println("Printing weights in Descending Order using selection sort:");
		    for (int i = 0; i < 19; i++) 
		    {
		        System.out.print(arr[i] + " ");
		    }
		    System.out.print(arr[19]);
		    System.out.println(" ");
        }
    }
