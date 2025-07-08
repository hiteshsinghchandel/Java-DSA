import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // lopps are used when we have to do a work in continuous manner!!
        // there are 3 types of loops
        // 1. while loop
        // 2. do while loop
        // for loop
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Hello!!");

        }
    }
}
