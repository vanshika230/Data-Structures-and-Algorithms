import java.io.*;
import java.util.*;

public class All_Indices_of_ele {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    int x = scn.nextInt();
    int[] iarr = allIndices(arr, x, 0, 0);

    if (iarr.length == 0) {
      System.out.println();
      return;
    }

    for (int i = 0; i < iarr.length; i++) {
      System.out.println(iarr[i]);
    }
  }

  public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
    if (idx == arr.length) {
      return new int[fsf];
    }

    int[] iarr;

    if (arr[idx] == x) {
      iarr = allIndices(arr, x, idx + 1, fsf + 1);
      iarr[fsf] = idx;
    } else {
      iarr = allIndices(arr, x, idx + 1, fsf);
    }

    return iarr;
  }

}
/* 
Time Complexity:

As n (array's length) calls are made and work is done corresponding to these n calls therefore the time complexity becomes O(n).


Space Complexity:

Since an array has been used to store all the indices which can be, therefore space complexity is constant, however you should know that if the recursion call stack is taken into account, then space complexity will be O(n) as there are n recursive calls.
*/
