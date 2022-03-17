import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        B obj = new B(num);
    }
}

class A {
    int a;

    A(int num) {
        a = num;
        System.out.println("Base class parameterized constructor called");
    }
}

class B extends A {
    B(int num) {
        super(num);
        System.out.println("Derived class parameterized constructor called");
    }
}