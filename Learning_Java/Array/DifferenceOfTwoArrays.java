import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int n = sc.nextInt();
        int[] arr1;
        arr1 = new int[n];

        System.out.println("Enter the values in the first array");
        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array");
        int m = sc.nextInt();
        int[] arr2;
        arr2 = new int[m];

        System.out.println("Enter the values in the second array");
        for (int i = 0; i < arr2.length; ++i) {
            arr2[i] = sc.nextInt();
        }

        System.out.print("array2 - array1 = ");

        int c = 0;
        int[] dif;
        dif = new int[(n > m) ? n : m];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = dif.length - 1;

        while (k >= 0) {
            int d = 0;
            int a1v = (i >= 0)?arr1[i] : 0;

            if (arr2[j] + c >= a1v) {
                d = arr2[j] + c - a1v;
                c = 0;
            } else {
                d = arr2[j] + 10 + c - a1v;
                c = -1;
            }
            dif[k] = d;

            i--;
            j--;
            k--;
        }

       int idx = 0;
       while(idx < dif.length)
       {
           if(dif[idx] == 0)
           {
            idx++;
           }
           else
           {
               break;
           }
       }

        for (; idx < dif.length; ++idx) {
            System.out.print(dif[idx] + " ");
        }
        System.out.println();
    }
}
