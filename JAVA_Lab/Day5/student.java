import java.util.*;

public class student {
    String name;
    int roll;
    double cgpa;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Enter roll: ");
        roll = sc.nextInt();
        System.out.print("Enter cgpa: ");
        cgpa = sc.nextDouble();
    }

    void display() {
        System.out.println("Name: " + name + "\nRoll: " + roll + "\nCGPA: " + cgpa);
    }

    public static void main(String args[]) {

        System.out.print("Enter number of students: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student ob[] = new student[n];
        for (int i = 0; i < n; i++)
            ob[i] = new student();
        for (int i = 0; i < n; i++)
            ob[i].input();
        for (int i = 0; i < n; i++)
            ob[i].display();
        double min = ob[0].cgpa;
        int p = 0;
        for (int i = 1; i < n; i++) {
            if (ob[i].cgpa < min)
                p = i;
        }
        System.out.println("Student with lowest cgpa is: " + ob[p].name);
        sc.close();
    }
}