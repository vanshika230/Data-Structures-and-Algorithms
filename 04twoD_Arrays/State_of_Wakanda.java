import java.io.*;

import java.util.*;

public class State_of_Wakanda {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    for (int j = 0; j < arr[0].length; j++) {
      if (j % 2 == 0) {
        for (int i = 0; i < arr.length; i++)
          System.out.println(arr[i][j]);
      } else {
        for (int i = arr.length - 1; i >= 0; i--)
          System.out.println(arr[i][j]);
      }
    }
  }
}

/*
 * /*
 * Time Complexity:

O(n^2) As there is nested for loop and the outer for loop runs n times. There are two inner for loops. Either one will run in each iteration. Making the time complexity: O(n)*(O(n/2)+O(n/2))= O(n^2).


Space Complexity:

O(1) Since, we are not using any auxiliary space and hence the space complexity is O(1).
 * 
 */
 */