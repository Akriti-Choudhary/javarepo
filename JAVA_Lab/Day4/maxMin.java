import java.lang.Math;

public class maxMin {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int a;
        for (int i = 0; i < 5; ++i) {
            a = Integer.parseInt(args[i]);
            arr[i] = a;
        }
        int max = 0;
        int min = 0;
        int sum = 0;
        int standardDeviation = 0;
        for (int i = 0; i < 10; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int mean = sum / 5;
        for (int i = 0; i < 5; i++) {
            standardDeviation = standardDeviation + (int) Math.pow((arr[i] - mean), 2);

        }

        System.out.println("Max Num = " + max);
        System.out.println("Min Num = " + min);
        System.out.println("Average = " + sum / 5);
        System.out.println("standardDeviation = " + standardDeviation);

    }

}
