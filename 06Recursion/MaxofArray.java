import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int []a = new int[n];

    for (int i = 0; i < n; i++)
    {
      a[i] = scn.nextInt();
    }
    int max = maxOfArray(a, 0);
    System.out.println(max);

  }

  public static int maxOfArray(int[] arr, int idx) {

    if (idx >= arr.length)
    {
      return Integer.MIN_VALUE;  //we have the constraint that the size of array will not be zero hence we have not considered that case here
    }

    int misa = maxOfArray(arr, idx + 1); //misa stands for maximum in smaller array

    if (arr[idx] > misa)
    {
      return arr[idx];
    }
    return misa;

  }

}

/*
Time Complexity :

The time complexity of the above solution is O(n). This is because we have iterated the array twice. Once while going into the recursion and the other time while coming out of it. So, n elements were visited twice: n+n= 2n, O(2n)=O(n).


SPACE COMPLEXITY :

The space complexity will be O(1) as we have not used any extra space. If we consider the recursion space, it will be O(n) i.e. the maximum height of the recursion stack.
*/
