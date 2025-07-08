import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
//        conditional!!
//        this is used whenever we have some coditions
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the salary : ");
        int salary = sc.nextInt();
        int bonus;
       if (salary >= 20000){   //this is a condition
             bonus = salary + 5000;
        }else {
            bonus = salary + 2500;
        }
        System.out.print("Salary including bonus is : " + bonus);

    }
}