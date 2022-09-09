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