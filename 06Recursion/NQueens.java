import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] chess = new int[n][n];
    printNQueens(chess, "", 0);
  }

  public static void printNQueens(int[][] chess, String qsf, int row) {
    if (row == chess.length) {
      System.out.println(qsf + ".");
      return;
    }
    for (int col = 0; col < chess.length; col++) {
      if (chess[row][col] == 0
          && isQueenSafe(chess, row, col) == true) {
        chess[row][col] = 1;
        printNQueens(chess,
                     qsf + row + "-" + col + ", ", row + 1);
        chess[row][col] = 0;
      }
    }
  }

  public static boolean isQueenSafe(int[][] chess,
                                    int row, int col) {
    for (int i = row - 1, j = col - 1;
         i >= 0 && j >= 0; i--, j--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }

    for (int i = row - 1, j = col; i >= 0; i--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }

    for (int i = row - 1, j = col + 1; i >= 0
         && j < chess.length; i--, j++) {
      if (chess[i][j] == 1) {
        return false;
      }
    }

    for (int i = row, j = col - 1; j >= 0; j--) {
      if (chess[i][j] == 1) {
        return false;
      }
    }

    return true;
  }
}

/*
Time Complexity :

This code is exponential in nature, and it's time complexity will turn out to be O(n!). It is better than the brute force/naive approach which has O(n^n) time complexity.
Mathematical Proof of Time Complexity

Let us assume that the run-time for nrows is T(n). Hence, for n-1 rows, the run-time will be T(n-1). Since, we are making at max n calls, (for n columns) to the recursive function with n-1 rows left, hence: T(n) = n * T(n-1) + O(Checking if the configuration is valid) For the first row {T(n)}, we will have 0 previous rows to check, for the 2nd row, we will have 1 previous row to check and so on, until the last row for which we need to check for (n-1) previous rows.
SPACE COMPLEXITY :

The maximum number of recursive calls can be equal to the number of rows. Hence the recursion stack call will take atmax O(n) space. However, we are not using any extra data structure, hence O(1) auxiliary space. Follow Up: Solution can also be solved using Branch & Bound technique. Also, this approach can be optimized using Bit Manipulation.*/
