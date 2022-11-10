import java.io.*;
import java.util.*;

public class Search_in_sorted_2d_array {

    public static void main(String[] args) throws Exception {
        // write your code here
   import java.util.*;


public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }
    int data = scn.nextInt();

    int row = 0;
    int col = n - 1;
    while (row < n && col >= 0) {
      if (arr[row][col] == data) {
        System.out.println(row);
        System.out.println(col);
        return;
      }
      if (arr[row][col] > data) {
        col--;
      } else {
        row++;
      }
    }
    System.out.print("Not Found");
  }
}
}
