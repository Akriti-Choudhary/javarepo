
import java.util.*;

public class sumOfTwoArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n = sc.nextInt();
        int[] arr1;
        arr1 = new int[n];

        System.out.println("Enter the size of the second array");
        int m = sc.nextInt();
        int[] arr2;
        arr2 = new int[m];

        System.out.println("Enter the values in the first array");
        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the values in the second array");
        for (int i = 0; i < arr2.length; ++i) {
            arr2[i] = sc.nextInt();
        }

        int c = 0;
        int[] sum;
        sum = new int[(n>m)?n:m];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        
        while(k > 0)
        {
            int d = c;
            if(i >= 0)
            {
                d += arr1[i]; 
            }
            if(j >= 0)
            {
                d += arr2[j]; 
            }

            c = d/10;
            d = d%10;
            sum[k] = d;

            i--;
            j--;
            k--;
        }
        if(c != 0)
        {
            System.out.println(c+ " ");
        }

        for(int p = 0 ; p < sum.length; ++p)
        {
            System.out.println(sum[p] + " ");
        }
        System.out.println();
       
    }
}

