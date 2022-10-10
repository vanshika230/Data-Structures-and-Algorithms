import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    int a1[] = new int[n1];

    for (int i = 0; i < a1.length; i++) {
      a1[i] = scn.nextInt();
    }

    int n2 = scn.nextInt();
    int a2[] = new int[n2];

    for (int i = 0; i < a2.length; i++) {
      a2[i] = scn.nextInt();
    }

    int diff[] = new int[n2];
    int c = 0;
    int i = a1.length - 1;
    int j = a2.length - 1;
    int k = diff.length - 1;

    while (k >= 0) {
      int d = 0;
      int a1v = (i >= 0 ? a1[i] : 0);
      if (a2[j] + c >= a1v) {
        d = a2[j] + c - a1v;
        c = 0;
      } else {
        d = a2[j] + 10 + c - a1v;
        c = -1;
      }

      diff[k] = d;
      i--;
      j--;
      k--;
    }

    int idx = 0;
    while (idx < diff.length && diff[idx] == 0) {
      idx++;
    }

    while (idx < diff.length) {
      System.out.println(diff[idx++]);

    }
  }
}

/*
Time Complexity:

O(n2) = Linear Let's look at the number of loop passes we are doing. [Ignore the input-output operation]. There is just one loop where we have iterated through the size of the array a2 i.e. n2. Hence we can clearly state that the time complexity is of order n2.


SPACE COMPLEXITY:

Although we are not using any extra space for calculation just storing the digits of the result in the diff array. So still we can assume it is using constant auxiliary space.

*/
