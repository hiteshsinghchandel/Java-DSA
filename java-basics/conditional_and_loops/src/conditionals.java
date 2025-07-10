import java.util.Scanner;

//public class conditionals {
//    public static void main(String[] args) {
////        conditional!!
////        this is used whenever we have some coditions
//        Scanner sc =new Scanner(System.in);
//        System.out.print("enter the salary : ");
//        int salary = sc.nextInt();
//        int bonus;
//       if (salary >= 20000){   //this is a condition
//             bonus = salary + 5000;
//        }else {
//            bonus = salary + 2500;
//        }
//        System.out.print("Salary including bonus is : " + bonus);
//
//    }
//}

//    Question for finding the largest value.
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("enter the value of c : ");
        int c = sc.nextInt();

        int max = 0;
        if(a>max){
            max = a;
        } if (b>max) {
            max =b;

        }if (max<c){
            max=c;
        }
        System.out.println("maximum value is : " + max);
    }
}