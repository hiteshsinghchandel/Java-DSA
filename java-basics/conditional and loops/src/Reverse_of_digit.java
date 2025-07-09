import java.util.Scanner;

public class Reverse_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        int r =0 ;
       while (n != 0){
           int t = (n % 10);

           n = n/10;
           r = r*10 + t;

       }
        System.out.println(r);
    }
}
