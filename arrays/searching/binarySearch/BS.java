 package binarySearch;
 /*
  * it is another way of searching ......
  it is more efficent than linear search.....

  in this file i created  a function bs(binary searh)....
  and than call it in main function............
  */

import java.util.Arrays;
import java.util.Scanner;

public class BS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        // System.out.println(Arrays.toString(arr));
        int b = bs(arr, 5);
        System.out.println(b);
        
    }
    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length;
     
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (arr[start]<arr[end]) {
                if (arr[mid]<target) {
                    start = mid +1;  
                }else{
                    end = mid-1;
                }
                
            }else{
                 if (arr[mid]<target) {
                    end = mid -1;  
                }else{
                    start = mid+1;
                }

            }
            
        }return -1;
    }

    
}