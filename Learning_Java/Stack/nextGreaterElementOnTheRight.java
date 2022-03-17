import java.util.*;

public class nextGreaterElementOnTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        System.out.println("Enter the elements in the array");
        for(int i = 0 ; i < n; ++i)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = n-1 ; i >= 0; --i)
        {
            if(st.size() == 0)
            {
                ans[i] = -1;
            }
            else if(st.size() > 0 && st.peek() > arr[i])
            {
                ans[i] = st.peek();
            }
            else if(st.size() > 0 && st.peek() < arr[i])
            {
                while(st.size() > 0 && st.peek() < arr[i])
                {
                    st.pop();
                }
                if(st.size() == 0)
                {
                    ans[i] = -1;
                }
                else
                {
                    ans[i] = st.peek();
                }
            }

            st.push(arr[i]);
        }
        System.out.println("The NGR elements are :");
        for(int i = 0 ; i < n ;++i)
        {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

    }
}
