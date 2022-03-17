public class evenOdd {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int a;
        for (int i = 0; i < 10; ++i) {
            a = Integer.parseInt(args[i]);
            arr[i] = a;
        }
        for (int i = 0; i < 10; ++i) {

            if (arr[i] % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("odd");
            }
        }

    }
}
