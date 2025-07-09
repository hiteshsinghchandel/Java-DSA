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
//        for loop
        /*syntax:
        for(initialisation; condition; increment;){

               body of loop
        }
         */
       int n = sc.nextInt();
      for (int i = 0; i < n; i++) {
            System.out.println("Hello!!");

        }
        /*  while loop:
        syntax:
           while(condition){

               body

           }
         */
        int i = 1;
        while(i<=n) {
            System.out.println(i +" hello ");
            i = i + 1;
        }
    }
}
