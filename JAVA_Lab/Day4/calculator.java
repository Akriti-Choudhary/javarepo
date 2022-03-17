public class calculator {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        String b = args[1];
        int c = Integer.parseInt(args[2]);

        if (b.equals("+")) {
            System.out.println("a + c = " + (a + c));
        }
        if (b.equals("-")) {
            System.out.println("a - c = " + (a - c));
        }
        if (b.equals("*")) {
            System.out.println("a * c = " + (a * c));
        }
        if (b.equals("/")) {
            System.out.println("a / c = " + (a / c));
        }

    }

}
