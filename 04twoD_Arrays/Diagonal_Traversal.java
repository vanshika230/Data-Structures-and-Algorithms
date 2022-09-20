
import java.io.*;

import java.util.*;

public class Diagonal_Traversal {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    for (int gap = 0; gap < n; gap++) {
      for (int i = 0, j = gap; j < n; i++, j++) {
        System.out.println(arr[i][j]);
      }
    }
  }

}

/*
 * Time Complexity:

When gap = 0, the inner loop run"s n times When gap = 1, the inner loop run"s n-1 times When gap = 2, the inner loop run"s n-2 times . . . So considering all the gaps the inner loop will be running: n + (n-1) + (n-2) + (n-3) + ... times = n*(n+1)/2 which is of the order O(n2).


Space Complexity:

We are not using any auxiliary space and hence the space complexity is O(1).
 */