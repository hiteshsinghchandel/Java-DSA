import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   /*    Arrays
       syntax:
          datatype[] name = new datatype[size];
             or
             datatype [] name = { (data), , ]

*/
        int [] a = new  int[5];
//        or
        int [] b  = {1 ,2,3,4};

//        System.out.print(b[3]);
//        System.out.println((Arrays.toString(b)));





// for 2-D arrays.....

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = sc.nextInt();

            }

        }
        
        // this is for printing 2d arrays
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]);

            }
            System.out.println(" ");

        }

        // this is for printing 2d arrays(alternate way..)
                for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }



        }

    }
