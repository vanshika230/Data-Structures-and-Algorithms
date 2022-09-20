import java.io.*;
import java.util.*;
public class Matrix_Multiplication {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr1 = new int[n1][m1];
    for (int i = 0; i < n1; i++) {                      //1
      for (int j = 0; j < m1; j++) {
        arr1[i][j] = scn.nextInt();
      }
    }
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n2][m2];
    for (int i = 0; i < n2; i++) {                      //2
      for (int j = 0; j < m2; j++) {
        arr2[i][j] = scn.nextInt();
      }
    }

    if (m1 != n2) {
      System.out.print("Invalid input");              //3
      return;
    }
    int[][] ans = new int[n1][m2];
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m2; j++) {                  //4
        for (int k = 0; k < m1; k++) {
          ans[i][j] += (arr1[i][k] * arr2[k][j]);
        }
      }
    }
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < m2; j++) {
        System.out.print(ans[i][j] + " ");          //5
      }
      System.out.println();
    }
  }
}

/*
 * Time Complexity:

O(n^3) This time complexity is cubic because 3 nested for loops are used.


Space Complexity:

O(n^2) As 2D arrays are used to store numbers, therefore space complexity is quadratic.
 */