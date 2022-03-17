import java.util.*;
class usingArray{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the marks of 5 subjects");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The marks of 5 subjects are :");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println("Subject "+(i+1) + " : " +arr[i]); 
        }
    }
}