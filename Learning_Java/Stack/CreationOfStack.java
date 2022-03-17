import java.util.*;

public class CreationOfStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.push(20);
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.push(30);
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.push(40);
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.pop();
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.pop();
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.pop();
        System.out.println(st + " -> size = " + st.size() + " peek = " + st.peek());
        st.pop();
        System.out.println(st + " -> size = " + st.size());

    }
}