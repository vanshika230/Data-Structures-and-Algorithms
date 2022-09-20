import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = Integer.parseInt(br.readLine());
      }
    }

    rotateby90(arr);
    display(arr);
  }

  public static void Rotate_90_degree(int[][] arr) {
    // transpose
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < i; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }
    // reverse columns, row by row
    for (int i = 0; i < arr.length; i++) {
      int li = 0;
      int ri = arr[0].length - 1;
      while (li <= ri) {
        int temp = arr[i][li];
        arr[i][li] = arr[i][ri];
        arr[i][ri] = temp;

        li++;
        ri--;
      }
    }
  }
  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}

/*
 *Time Complexity:

The time complexity for rotating the matrix by this procedure is O(n2) as for transposing we are traversing the upper triangle i.e. we are traversing n2/2 elements and then reversing takes O(n) time and we have to reverse n rows. So it becomes O(n2 + n2/2) which is O(n2).

Space Complexity:

The space complexity is O(1) as we are transposing and then reversing in-place and we are not consuming any auxiliary memory
 
*/