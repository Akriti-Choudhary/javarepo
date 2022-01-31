import java.util.*;
public class userInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
         int n = Integer.parseInt(sc.nextLine());

         for(int i = 0 ; i <= n ; i++)
         {
            System.out.println(i);
         }
         System.out.println("Enter a name :");

        String name = sc.nextLine();

        System.out.println("Name : "+name); 
    }
}
