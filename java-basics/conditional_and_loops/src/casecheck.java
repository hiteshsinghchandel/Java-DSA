import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the word : ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch<= 'z'){
            System.out.print("word is started with lowercase later : " + ch);
        }else{
            System.out.print("Word is uppercase latter : " + ch);
        }
    }
}
