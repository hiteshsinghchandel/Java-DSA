import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.print("enter the array : ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        int a  = Lsearch(arr,target);
        System.out.println(a);


    }
    static int Lsearch(int[] arr , int n){

        for (int index = 0; index < arr.length ; index++) {
            if (arr[index]==n){
                return index;
            }

        }return -1;
    }
}