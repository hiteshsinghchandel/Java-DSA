import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. division");
        System.out.println("5. Modulus");
        System.out.print("enter the choice :");
        int choice = sc.nextInt();

//        //swich case is use  to switch over cases
//        // syntax:
//        // switch(condition){
//        case ():
//               body...
//        case ():
//               body...
//        .
//        .
//        .
//        case ():
//               body...}

        switch (choice) {
            case 1 :
                System.out.println("addition : " + (a +b));
                break;
            case 2 :
                System.out.println("subtraction : " + (a-b));
                break;
            case 3 :
                System.out.println("Multiplication :" + (a*b));
                break;
            case 4:
                if (b!=0) {
                    System.out.println("division : " + (a/b));

                }else {
                    System.out.println("enter a valid value of b");
                }
            case 5:
                System.out.println(a%b);
        }
    }
}