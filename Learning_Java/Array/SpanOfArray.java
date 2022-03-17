import java.util.*;
public class SpanOfArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Enter the values in the array");
        for(int i = 0 ; i < arr.length; ++i)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i < arr.length; ++i)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Span of array(max - min) = "+ (max - min));
    }
}
