
import java.util.*;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        System.out.println("Enter the values in the array");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                pos = i;
                break;
            } 

        }
        System.out.println(pos);

    }
}
