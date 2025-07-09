import java.util.Scanner;

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the value of nth number : ");
       // nth number who's value i want to determine
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2; // cout is 2 because a zero number ka hai ,b first number ka hai,
        // ab jo aadege wale honge vo 2 number se start honge
        while (count <= n){
            int store = b;
            b  = a +b;
            a = store;
            count++;
        }
        System.out.println(b);
    }
}
