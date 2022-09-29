import java.io.*;
 
import java.util.*;

public class Factorial {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int f = factorial(n);
    System.out.println(f);
  }
 
  public static int factorial(int n) {
    if (n == 1) { //1
      return 1;
    }
 
    int fnm1 = factorial(n - 1); //2
    int fn = n * fnm1;  //3
    return fn;  //4
  }
}


/*
 * Time complexity: O(n)

This time complexity is linear because a recursion call is made.


Space complexity: O(1)

As no extra space is required, therefore space complexity is constant. However, if we include the space used in the recursive stack then the space complexity is O(n).
 */