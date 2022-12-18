import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }

    displayArrRev(arr, 0);

  }

  public static void displayArrRev(int[] arr, int idx) {
    if (idx == arr.length) return;
    displayArrRev(arr, idx + 1);
    System.out.println(arr[idx]);
  }

}
/*
Time Complexity :

O(n) Let's try to understand our time complexity. It will be similar to the previous problem. Since we are making at most n recursion calls and in each call we are performing O(1) operations 
(printing a data is constant time) so our overall time complexity is n*O(1) = O(n).


SPACE COMPLEXITY :

O(n) Also, we know for each recursion call the parameters, address of the array are stored in the runtime stack,
and since the recursive call stack is of n length it will also take n space in the stack. Although we are not using any array the space complexity will still be O(n).
*/
