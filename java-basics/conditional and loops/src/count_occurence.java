import java.util.Arrays;
import java.util.Scanner;

public class count_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        System.out.print("enter the nuber for which you want to check : ");
        int a = sc.nextInt();
        int count = 0;
        while (n != 0){
            if (n % 10 == a){
                count = count+1;
                n = (n/10);
            }else {
                n = (n/10);
            }
        }
        System.out.println(count);
    }
}
