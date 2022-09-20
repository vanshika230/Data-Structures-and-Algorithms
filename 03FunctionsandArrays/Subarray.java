import java.io.*;

import java.util.*;

public class Subarray {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt;

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt;
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + "	");
        }
        System.out.println();
      }
    }
  }

}

/*
 * Time Complexity: O(n^3)

Double nested "for" loop has been used to print all the subarrays of the given array; travelling the n sized array 3 times makes the time complexity O(n^3).


SPACE COMPLEXITY: O(1)

Since no extra space is used, therefore space complexity is constant.
 */