import java.util.*;

public class Fibbonaci_till_n {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;

        }
    }
}

/*
 * Solution 1: Iterative
 * 
 * Time complexity: O(n)
 * Space complexity: O(1)
 */

class Solution {
    public int fib(int N) {
        if (N <= 1)
            return N;

        int a = 0, b = 1;

        while (N-- > 1) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
/*
 * Solution 2: Recursive
 * 
 * Time complexity: O(2^n) - since T(n) = T(n-1) + T(n-2) is an exponential time
 * Space complexity: O(n) - space for recursive function call stack
 */

class Solution {
    public int fib(int N) {
        if (N <= 1)
            return N;
        else
            return fib(N - 1) + fib(N - 2);
    }
}

/*
 * Using Dynamic Programming: We can avoid the repeated work done in method 2 by storing the Fibonacci numbers calculated so far. Below are the steps:

Create an array arr[] of size N.
Initialize arr[0] = 0, arr[1] = 1.
Iterate over [2, N] and update the array arr[] as:
arr[i] = arr[i – 2] + arr[i – 1]
Time Complexity: O(N) 
Auxiliary Space: O(N)
 
 */

class fibonacci {
  
    // Function to find the fibonacci Series
    static int fib(int n)
    {
  
        // Declare an array to store
        // Fibonacci numbers.
        // 1 extra to handle case, n = 0
        int f[] = new int[n + 2];
  
        int i;
  
        // 0th and 1st number of
        // the series are 0 and 1
        f[0] = 0;
        f[1] = 1;
  
        for (i = 2; i <= n; i++) {
  
            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
        }
  
        // Nth Fibonacci Number
        return f[n];
    }
  
    public static void
    main(String args[])
    {
        // Given Number N
        int N = 10;
  
        // Print first 10 term
        for (int i = 0; i < N; i++)
            System.out.print(fib(i) + " ");
    }
}