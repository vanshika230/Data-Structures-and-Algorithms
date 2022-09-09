import java.io.*;
import java.util.*;

public class Bar_Chart{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n= scn.nextInt();
    int[] arr= new int[n];
    for (int i = 0; i < n; i++) {
        arr[i]=scn.nextInt();
    }
    // arr 3 1 0 7 5
    int max=arr[0];
    for (int i = 0; i < n; i++) {
     if(arr[i]>max){
         max=arr[i];
     }   
    }
    //row loop - outer loop
    for (int i = max; i >= 1; i--) {
     // col loop 
      for (int j = 0; j < n; j++) {
          if(arr[j]>=i){
              System.out.print("*\t");
          }
          else{
              System.out.print("\t");
          }
      }
    System.out.println();
    }
    
 }

}

/*
 * Time Complexity:

O(n2) This time complexity is quadratic because nested for loops are used.


SPACE COMPLEXITY:

O(n) As a 1D array is used, therefore space complexity is linear.
 */